import java.applet.Applet;
import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventHandlingThird extends Applet implements ActionListener,ItemListener{
	List l,ll;
	@Override
	public void init() {
		setSize(500,500);
		l=new List();
		l.add("RED");
		l.add("GREEN");
		l.add("BLUE");
		l.add("WHITE");
		add(l);
		l.addActionListener(this);
		

		ll=new List();
		ll.add("RED");
		ll.add("GREEN");
		ll.add("BLUE");
		ll.add("WHITE");
		add(ll);
		ll.addItemListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str=l.getSelectedItem();
		switch(str){
			case "RED":{
				setBackground(Color.red);
				break;
			}
			case "BLUE":{
				setBackground(Color.blue);
				break;
			}
			case "GREEN":{
				setBackground(Color.green);
				break;
			}
			case "WHITE":{
				setBackground(Color.white);
				break;
			}
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		String str=ll.getSelectedItem();
		switch(str){
			case "RED":{
				setBackground(Color.red);
				break;
			}
			case "BLUE":{
				setBackground(Color.blue);
				break;
			}
			case "GREEN":{
				setBackground(Color.green);
				break;
			}
			case "WHITE":{
				setBackground(Color.white);
				break;
			}
		}
	}
}
