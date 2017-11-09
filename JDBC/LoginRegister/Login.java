import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	JTextField username;
	JPasswordField password;
	JButton login,reset;
	JLabel l1,l2;
	public Login(String str){
		super(str);
		setSize(500,200);
		setLocationRelativeTo(this);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		username = new JTextField(12);
		password = new JPasswordField(12);
		login = new JButton("Login");
		reset = new JButton("Reset");
		l1=new JLabel("Enter Username");
		l2=new JLabel("Enter Password");
		login.addActionListener(this);
		reset.addActionListener(this);
		l1.setBounds(100,20,100,10);
		l2.setBounds(100,50,100,10);
		username.setBounds(250,18,150,18);
		password.setBounds(250,48,150,18);
		login.setBounds(100,80,150,20);
		reset.setBounds(250,80,150,20);
		add(l1);
		add(username);
		add(l2);
		add(password);
		add(login);
		add(reset);
	}
	@Override
	public void actionPerformed(ActionEvent e){
		JButton btn=(JButton)e.getSource();
		if(btn==login){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject","root","tanay1998");
				String name=username.getText();
				char[] passc=password.getPassword();
				String pass=String.copyValueOf(passc);
				if(name.equals("")||pass.equals("")){
					JOptionPane.showMessageDialog(this, "Input is Empty!","ERROR!",JOptionPane.INFORMATION_MESSAGE);
					con.close();
					resetFunc();
				}
				else{
					String query="Select password from login where username = \""+name+"\"";
					String dpas="";
					boolean b=true;
					try{
						PreparedStatement stmt=con.prepareStatement(query);
						ResultSet res=stmt.executeQuery();
						res.next();
						dpas=res.getString(1);
						stmt.close();
						res.close();
						resetFunc();
					}catch(SQLException sqle){
						int in=JOptionPane.showConfirmDialog(getParent(), "Do you want to Register?","Wrong Credentials!",JOptionPane.YES_NO_OPTION);
						if(in==0){
							System.out.println("registeration requested!");
							new Register("Register Frame").setVisible(true);
							Login.this.dispose();
							con.close();
							resetFunc();
						}
						b=false;
					}
					//System.out.println(dpas);
					if(b){
						if(dpas.equals(pass)){
							JOptionPane.showMessageDialog(this,"Congratulations!","You have successfully Logged In!",JOptionPane.INFORMATION_MESSAGE);
						}
						else{
							JOptionPane.showMessageDialog(this, "Wrong Credentials!","Do You want to Register?",JOptionPane.INFORMATION_MESSAGE);
						}
					}
					con.close();
					resetFunc();
				}
			}catch(SQLException sqle){
				JOptionPane.showMessageDialog(this,sqle.getMessage(),"ERROR!",JOptionPane.ERROR_MESSAGE);
			}catch(ClassNotFoundException cnfe){
				JOptionPane.showMessageDialog(this,cnfe.getMessage(),"ERROR!",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(btn==reset){
			resetFunc();
		}
	}
	public void resetFunc(){
		username.setText(null);
		password.setText(null);
	}
	public static void main(String[] args){
		new Login("Login Frame").setVisible(true);
	}
}
