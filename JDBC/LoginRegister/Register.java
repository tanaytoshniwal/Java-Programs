import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField username,usertype;
	JPasswordField password;
	JButton register,reset;
	public Register(String str){
		super(str);
		setSize(500,200);
		setLocationRelativeTo(this);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		l3=new JLabel("Usertype");
		username=new JTextField(10);
		usertype=new JTextField(10);
		password=new JPasswordField(10);
		register=new JButton("Register");
		reset=new JButton("Reset");
		l1.setBounds(100,20,100,10);
		l2.setBounds(100,50,100,10);
		l3.setBounds(100,80,100,10);
		username.setBounds(250,18,150,18);
		password.setBounds(250,48,150,18);
		usertype.setBounds(250,78,150,18);
		register.setBounds(100,110,150,20);
		reset.setBounds(250,110,150,20);
		add(l1);
		add(username);
		add(l2);
		add(password);
		add(l3);
		add(usertype);
		add(register);
		add(reset);
		register.addActionListener(this);
		reset.addActionListener(this);
	}
	public void funcReset(){
		username.setText(null);
		usertype.setText(null);
		password.setText(null);
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==reset){
			funcReset();
		}
		else{
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject","root","tanay1998");
				String uname=username.getText();
				String utype=usertype.getText();
				char[] passc=password.getPassword();
				String pass=String.copyValueOf(passc);
				if(uname.equals("")||utype.equals("")||pass.equals("")){
					JOptionPane.showMessageDialog(this, "Input is Empty!", "ERROR!", JOptionPane.ERROR_MESSAGE);
				}
				else{
					String query="insert into login(username,password,usertype) values(\""+uname+"\",\""+pass+"\",\""+utype+"\")";
					//System.out.println(query);
					PreparedStatement stmt=con.prepareStatement(query);
					int rowsAffected=stmt.executeUpdate();
					System.out.println("Querry okay! "+rowsAffected+" Rows Affected!");
				}
			}catch(SQLException sqle){
				JOptionPane.showMessageDialog(this, sqle.getMessage(),"ERROR!", JOptionPane.ERROR_MESSAGE);
			}catch(ClassNotFoundException cnfe){
				JOptionPane.showMessageDialog(this, cnfe.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void main(String[] args){
		new Register("Register Frame").setVisible(true);
	}
}
