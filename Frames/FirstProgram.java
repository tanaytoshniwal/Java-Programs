import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstProgram extends Frame{
	public FirstProgram(String str){
		super(str);
		setSize(500,500);
		setLocationRelativeTo(this);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public static void main(String[] args){
		FirstProgram obj=new FirstProgram("Hello World");
	}
}
