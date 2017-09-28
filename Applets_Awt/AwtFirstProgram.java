import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;

public class AwtFirst extends Applet{
	Label l1,l2;
	Button b1,b2;
	TextField t1,t2;
	@Override
	public void init() {
		setSize(700,500);
		setBackground(Color.CYAN);
		l1=new Label("Enter Username");
		l2=new Label("Enter Password");
		t1=new TextField(30);
		t2=new TextField(30);
		t2.setEchoChar('*');
		b1=new Button("SAVE");
		b2=new Button("QUIT");
		add(l1);add(t1);
		add(l2);add(t2);
		add(b1);add(b2);
	}
}
