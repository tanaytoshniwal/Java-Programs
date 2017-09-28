import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class AwtFirst extends Applet{
	Label l1,l2;
	Button b1,b2;
	TextField t1,t2;
	TextArea ta;
	Checkbox c1,c2,c3;
	Checkbox c4,c5,c6;
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
		ta=new TextArea(10,20);
		add(ta);
		c1=new Checkbox("JAVA");
		c2=new Checkbox("JAVAEE");
		c3=new Checkbox("JAVAME");
		add(c1);add(c2);add(c3);
		
		CheckboxGroup obj=new CheckboxGroup();
		c4=new Checkbox("C", false, obj);
		c5=new Checkbox("C++", false, obj);
		c6=new Checkbox("C#", true, obj);
		add(c4);add(c5);add(c6);		
	}
}
