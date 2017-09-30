import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class EventHandlingEleventh extends Applet{
	Button b1,b2,b3,b4;
	@Override
	public void init() {
		setSize(500,500);
		b1=new Button("RED");
		b2=new Button("GREEN");
		b3=new Button("BLUE");
		b4=new Button("WHITE");
		add(b1);add(b2);add(b3);add(b4);
		b1.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e){
				setBackground(Color.red);
			}
		});
		b2.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e){
				setBackground(Color.green);
			}
		});
		b3.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e){
				setBackground(Color.blue);
			}
		});
		b4.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e){
				setBackground(Color.white);
			}
		});
	}
}
