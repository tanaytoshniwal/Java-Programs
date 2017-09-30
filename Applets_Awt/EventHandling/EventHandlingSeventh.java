import java.applet.Applet;
import java.awt.Button;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class EventHandlingSeventh extends Applet implements ActionListener{
	List l1,l2;
	Button b1,b2;
	@Override
	public void init() {
		setSize(500,500);
		l1=new List();
		l1.add("Item 1");
		l1.add("Item 2");
		l1.add("Item 3");
		l1.add("Item 4");
		l2=new List();
		b1=new Button(">>>");
		b2=new Button("<<<");
		add(l1);
		add(b1);
		add(b2);
		add(l2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			String s=l1.getSelectedItem();
			if(s==null){
				JOptionPane.showMessageDialog(this,"Select a item!","Error",JOptionPane.ERROR_MESSAGE);
			}
			else{
				l1.remove(s);
				l2.add(s);
			}
		}
		if(e.getSource()==b2){
			String s=l2.getSelectedItem();
			if(s==null){
				JOptionPane.showMessageDialog(this,"Select a item!","Error",JOptionPane.ERROR_MESSAGE);
			}
			else{
				l2.remove(s);
				l1.add(s);
			}
		}
	}
}
