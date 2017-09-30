import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventHandlingSixth extends Applet implements ActionListener{
	Choice c;
	Button b;
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
		b=new Button("click me!!!");
		add(b);
		b.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
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
