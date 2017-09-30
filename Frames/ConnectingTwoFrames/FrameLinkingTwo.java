import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameLinkingTwo extends Frame{
	Button b1;
	public FrameLinkingTwo(String str,Frame frame){
		super(str);
		setSize(500,500);
		setLocationRelativeTo(this);
		setVisible(true);
		setLayout(new FlowLayout());
		b1=new Button("Back");
		add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				frame.setVisible(true);
			}
		});
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}
