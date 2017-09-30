import java.applet.Applet;
import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventHandlingFifth extends Applet implements ItemListener{
	Choice c;
	@Override
	public void init() {
		setSize(600,660);
		c=new Choice();
		c.add("---SELECT---");
		c.add("RED");
		c.add("GREEN");
		c.add("BLUE");
		c.add("WHITE");
		add(c);
		c.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		String s=c.getSelectedItem();
		if(s.equalsIgnoreCase("red"))
			setBackground(Color.red);

		if(s.equalsIgnoreCase("blue"))
			setBackground(Color.blue);

		if(s.equalsIgnoreCase("green"))
			setBackground(Color.green);

		if(s.equalsIgnoreCase("white")||s.equalsIgnoreCase("---select---"))
			setBackground(Color.white);
	}

}
