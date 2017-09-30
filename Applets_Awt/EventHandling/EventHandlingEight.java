import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventHandlingEight extends Applet implements MouseListener{
	@Override
	public void init() {
		setSize(500,500);
		addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1&&e.getModifiers()==16){
			System.out.println("left button clicked");
		}
		else if(e.getButton()==MouseEvent.BUTTON2&&e.getModifiers()==8){
			System.out.println("middle button clicked");
		}
		else if(e.getButton()==MouseEvent.BUTTON3&&e.getModifiers()==4){
			System.out.println("right button clicked");
		}
		else{
			System.out.println("any other button pressed with value - "+e.getModifiers());
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouse entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouse exited");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mouse pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouse released");
	}
	
}
