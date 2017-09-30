import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingFirst extends Applet implements ActionListener{
	Button b1,b2,b3,b4;
	@Override
	public void init(){
		setSize(600,600);
		b1=new Button("RED");
		b2=new Button("GREEN");
		b3=new Button("BLUE");
		b4=new Button("WHITE");
		add(b1);add(b2);add(b3);add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		/*if(a.getSource()==b1){
			setBackground(Color.red);
		}
		if(a.getSource()==b2){
			setBackground(Color.green);
		}
		if(a.getSource()==b3){
			setBackground(Color.blue);
		}
		if(a.getSource()==b4){
			setBackground(Color.white);
		}*/
		String str=a.getActionCommand();
		switch(str){
		case "RED":{
			setBackground(Color.red);
			break;
		}
		case "WHITE":{
			setBackground(Color.white);
			break;
		}
		case "GREEN":{
			setBackground(Color.green);
			break;
		}
		case "BLUE":{
			setBackground(Color.blue);
			break;
		}
		}
	}
}
