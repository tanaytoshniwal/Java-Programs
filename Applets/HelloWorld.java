import java.applet.Applet;
import java.awt.Graphics;

public class Shapes extends Applet{
	@Override
	public void init(){
		super.init();
		setSize(700,500);
	}
	@Override
	public void paint(Graphics g){
		//H
		g.drawLine(20, 20, 20, 200);
		g.drawLine(100, 20, 100, 200);
		g.drawLine(20, 100, 100, 100);
		//E
		g.drawLine(120, 20, 120, 200);
		g.drawLine(120, 20, 200, 20);
		g.drawLine(120, 200, 200, 200);
		g.drawLine(120, 100, 150, 100);
		//L
		g.drawLine(220, 20, 220, 200);
		g.drawLine(220, 200, 300, 200);
		//L
		g.drawLine(320, 20, 320, 200);
		g.drawLine(320, 200, 400, 200);
		//O
		g.drawLine(420, 20, 420, 200);
		g.drawLine(420, 200, 500, 200);
		g.drawLine(420, 20, 500, 20);
		g.drawLine(500, 20, 500, 200);
	}
}
