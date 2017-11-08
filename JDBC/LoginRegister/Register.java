import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField username,usertype;
	JPasswordField password;
	JButton register,reset;
	public Register(String str){
		super(str);
		setSize(500,500);
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
	}
	@Override
	public void actionPerformed(ActionEvent e){
		
	}
	public static void main(String[] args){
		new Register("Register Frame").setVisible(true);
	}
}
