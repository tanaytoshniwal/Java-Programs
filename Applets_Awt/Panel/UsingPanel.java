import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class UsingPanel extends Applet{
	MyPanel p1,p2,p3,p4;
	@Override
	public void init() {
		setSize(500,500);
		p1=new MyPanel();
		p1.setLayout(new GridLayout(1, 4));
		
		p2=new MyPanel();
		p2.setLayout(new GridLayout(4, 1));
		
		p3=new MyPanel();
		p3.setLayout(new GridLayout(4, 1));
		
		p4=new MyPanel();
		p4.setLayout(new GridLayout(1, 4));
		
		setLayout(new BorderLayout());
		add(BorderLayout.NORTH,p1);
		add(BorderLayout.EAST,p2);
		add(BorderLayout.WEST,p3);
		add(BorderLayout.SOUTH,p4);
	}
}
