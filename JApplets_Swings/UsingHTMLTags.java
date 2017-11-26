import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
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
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Color c=JColorChooser.showDialog(UsingHETMLTags.this, "Choose Backgroung", Color.black);
				getContentPane().setBackground(c);
			}
		});
	}
	public static void main(String[]  args){
		new UsingHETMLTags().setVisible(true);
	}
}
