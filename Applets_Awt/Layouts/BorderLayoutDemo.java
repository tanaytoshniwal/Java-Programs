import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextArea;

public class BorderLayoutDemo extends Applet{
	Button b1,b2,b3,b4;
	TextArea ta;
	@Override
	public void init() {
		setSize(500,500);
		b1=new Button("RED");
		b2=new Button("BLACK");
		b3=new Button("GREEN");
		b4=new Button("YELLOW");
		ta=new TextArea(5,10);
		ta.setBackground(Color.YELLOW);
		setLayout(new BorderLayout());
		add(BorderLayout.NORTH,b1);
		add(BorderLayout.WEST,b2);
		add(BorderLayout.SOUTH,b3);
		add(BorderLayout.EAST,b4);
		add(BorderLayout.CENTER,ta);
	}
}
