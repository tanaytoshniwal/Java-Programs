import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Tab1 extends JPanel{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;
	public Tab1(){
		setSize(500,500);
		setLayout(new FlowLayout());
		l1=new  JLabel("Enter Username");
		l2=new  JLabel("Enter Password");
		t1=new JTextField(10);
		p1=new JPasswordField(10);
		b1=new JButton("SAVE");
		b2=new JButton("RESET");
		add(l1);add(t1);add(l2);add(p1);add(b1);add(b2);
	}
}
