import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EventHandlingNinth extends Applet implements FocusListener{
	Button b1,b2,b3,b4;
	@Override
	public void init() {
		setSize(500,500);
		b1=new Button("RED");
		b2=new Button("GREEN");
		b3=new Button("BLUE");
		b4=new Button("WHITE");
		add(b1);add(b2);add(b3);add(b4);
		b1.addFocusListener(this);
		b2.addFocusListener(this);
		b3.addFocusListener(this);
		b4.addFocusListener(this);
	}
	@Override
	public void focusGained(FocusEvent e){
		if(e.getSource()==b1)
			setBackground(Color.red);
		if(e.getSource()==b2)
			setBackground(Color.green);
		if(e.getSource()==b3)
			setBackground(Color.blue);
		if(e.getSource()==b4)
			setBackground(Color.white);
	}
	@Override
	public void focusLost(FocusEvent e){
		
	}
}
