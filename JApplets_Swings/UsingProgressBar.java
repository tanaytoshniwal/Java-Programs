import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class UsingProgressBar extends JFrame{
	JProgressBar bar;
	int i=0;
	public UsingProgressBar(){
		setSize(500,400);
		setLayout(new BorderLayout());
		setUndecorated(true);
		bar=new JProgressBar(0,1000);
		bar.setStringPainted(true);
		bar.setForeground(Color.BLUE);
		bar.setValue(0);
		add(BorderLayout.SOUTH,bar);
		
	}
	void setValue(){
		while(i<=1000){
			bar.setValue(i);
			i+=20;
			try{
				Thread.sleep(200);
			}catch(InterruptedException e){
			}
		}
		dispose();
	}
	public static void main(String[] args){
		UsingProgressBar ob=new UsingProgressBar();
		ob.setVisible(true);
		ob.setValue();
	}
}
