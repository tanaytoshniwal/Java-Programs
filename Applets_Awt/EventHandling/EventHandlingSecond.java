import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventHandlingSecond extends Applet implements ItemListener{
	Checkbox c1,c2,c3,c4;
	@Override
	public void init(){
		setSize(600,600);
		CheckboxGroup ob=new CheckboxGroup();
		c1=new Checkbox("RED", false, ob);
		c2=new Checkbox("GREEN", false, ob);
		c3=new Checkbox("BLUE", false, ob);
		c4=new Checkbox("WHITE", false, ob);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox c=(Checkbox)e.getSource();
		if(c==c1){
			setBackground(Color.red);
			c1.setBackground(Color.red);
			c2.setBackground(Color.red);
			c3.setBackground(Color.red);
			c4.setBackground(Color.red);
		}
		if(c==c2){
			setBackground(Color.green);
			c2.setBackground(Color.green);
			c1.setBackground(Color.green);
			c3.setBackground(Color.green);
			c4.setBackground(Color.green);
		}
		if(c==c3){
			setBackground(Color.blue);
			c3.setBackground(Color.blue);
			c2.setBackground(Color.blue);
			c1.setBackground(Color.blue);
			c4.setBackground(Color.blue);
		}
		if(c==c4){
			setBackground(Color.white);
			c4.setBackground(Color.white);
			c2.setBackground(Color.white);
			c3.setBackground(Color.white);
			c1.setBackground(Color.white);
		}
	}
}
