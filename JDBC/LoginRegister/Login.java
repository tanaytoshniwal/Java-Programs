import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
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
		setSize(500,500);
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
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject","root","root");
				
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
