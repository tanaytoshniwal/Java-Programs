import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class GridLayoutDemo extends Applet{
	FlowLayout layout;
	Button b1,b2,b3,b4,b5;
	@Override
	public void init() {
		setSize(600,600);
		b1=new Button("JAVA");
		b2=new Button("C++");
		b3=new Button("C");
		b4=new Button("C#");
		b5=new Button("Oracle");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setLayout(new GridLayout(2,2,10,10));
		layout=new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);
	}
}
