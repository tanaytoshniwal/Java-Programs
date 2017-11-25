import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Tab2 extends JPanel{
	JTextArea ta;
	JCheckBox c1,c2,c3;
	JRadioButton rb1,rb2,rb3;
	JScrollPane pane;
	ButtonGroup group;
	public Tab2(){
		setSize(500,500);
		setLayout(new FlowLayout());
		ta=new JTextArea(5,10);
		pane=new JScrollPane(ta);
		c1=new JCheckBox("C");
		c2=new JCheckBox("C++");
		c3=new JCheckBox("Java");
		rb1=new JRadioButton("JavaSE");
		rb2=new JRadioButton("JavaEE");
		rb3=new JRadioButton("JavaME");
		group=new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		group.add(rb3);
		add(pane);add(c1);add(c2);add(c3);add(rb1);add(rb2);add(rb3);
	}
}
