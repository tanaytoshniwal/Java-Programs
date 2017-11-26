import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class UsingBorders extends JFrame{
	UsingBordersPanel p1,p2,p3,p4,p5,p6,p7,p8,p9;
	public UsingBorders(){
		setSize(500,500);
		setLayout(new GridLayout(0,1));
		p1=new UsingBordersPanel(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		p2=new UsingBordersPanel(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		p3=new UsingBordersPanel(BorderFactory.createDashedBorder(null));
		p4=new UsingBordersPanel(BorderFactory.createEtchedBorder());
		p5=new UsingBordersPanel(BorderFactory.createLineBorder(Color.BLUE,3));
		p6=new UsingBordersPanel(BorderFactory.createCompoundBorder());
		p7=new UsingBordersPanel(BorderFactory.createTitledBorder("title"));
		p8=new UsingBordersPanel(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.GRAY));
		p9=new UsingBordersPanel(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(p8);
		add(p9);
	}
	public static void main(String[] args){
		new UsingBorders().setVisible(true);
	}
}
