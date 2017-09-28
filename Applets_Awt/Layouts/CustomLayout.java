import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;

public class CustomLayout extends Applet{
	Button b1,b2;
	TextField t1,t2;
	Label l1,l2;
	@Override
	public void init() {
		setSize(400,200);
		setLayout(null);
		setBackground(Color.cyan);
		l1=new Label("Enter Username");
		l2=new Label("Enter Password");
		t1=new TextField();
		t2=new TextField();
		t2.setEchoChar('*');
		b1=new Button("SAVE");
		b2=new Button("EXIT");
		
		l1.setBounds(100,40,120,20);
		t1.setBounds(220, 40, 100, 20);
		l2.setBounds(100,70,120,20);
		t2.setBounds(220, 70, 100, 20);
		b1.setBounds(100, 100, 120, 20);
		b2.setBounds(220,100,100,20);
		
		add(l1);add(t1);
		add(l2);add(t2);
		add(b1);add(b2);
	}
}
