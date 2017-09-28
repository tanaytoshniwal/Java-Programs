import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class DemoApplet extends Applet{
	@Override
	public void init(){
		super.init();
		setSize(500,500);
		setBackground(Color.CYAN);
		setForeground(Color.darkGray);
		Font font=new Font(Font.MONOSPACED, Font.BOLD|Font.ITALIC, 50);
		setFont(font); 
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("Hello World!!!", 50, 100);
	}
}
