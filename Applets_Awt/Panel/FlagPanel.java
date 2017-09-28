import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

public class FlagPanel extends Panel{
	public boolean b=false;
	public FlagPanel(Color c){
		this.setBackground(c);
	}
	public void drawAshoka(){
		b=true;
	}
	@Override
	public void paint(Graphics g) {
		if(b){
			g.setColor(Color.blue);
			g.fillOval(400, 35, 100, 100);
			System.out.println(b);
		}
	}
}
