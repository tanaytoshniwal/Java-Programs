import java.applet.Applet;
import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingFourth extends Applet implements ActionListener{
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
		add(ll);
		ll.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==l){
			String str=l.getSelectedItem();
			l.remove(str);
			ll.add(str);
		}
		if(e.getSource()==ll){
			String str=ll.getSelectedItem();
			ll.remove(str);
			l.add(str);
		}
	}
}
