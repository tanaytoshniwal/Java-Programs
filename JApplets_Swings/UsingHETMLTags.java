import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UsingHETMLTags extends JFrame{
	public UsingHETMLTags(){
		FrameProperty.set(this, "Using HTML Tags", 500, 500, false, new FlowLayout(), EXIT_ON_CLOSE);
		JLabel obj=new JLabel("<HTML><FONT face='arial' size='30' color='blue'>Hello");
		add(obj);
		JButton btn=new JButton("<HTML><FONT face='arial' size='30' bgcolor='yello' color='blue'>Button");
		btn.setOpaque(true);
		add(btn);
	}
	public static void main(String[]  args){
		new UsingHETMLTags().setVisible(true);
	}
}
