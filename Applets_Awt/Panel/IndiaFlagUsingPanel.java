import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

public class IndiaFlagUsingPanel extends Applet{
	FlagPanel p1,p2,p3;
	@Override
	public void init(){
		setSize(900,500);
		setLayout(new GridLayout(3, 1));
		p1=new FlagPanel(Color.ORANGE);
		p2=new FlagPanel(Color.WHITE);
		p2.drawAshoka();
		p3=new FlagPanel(Color.GREEN);
		add(p1);
		add(p2);
		add(p3);
	}
}
