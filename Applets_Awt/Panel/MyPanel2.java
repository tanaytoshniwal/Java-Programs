import java.awt.Button;
import java.awt.LayoutManager;
import java.awt.Panel;

public class MyPanel2 extends Panel{
	Button b1,b2,b3,b4;
	public MyPanel2(LayoutManager layout){
		this.setLayout(layout);
		b1=new Button("Button 1");
		b2=new Button("Button 2");
		b3=new Button("Button 3");
		b4=new Button("Button 4");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
}
