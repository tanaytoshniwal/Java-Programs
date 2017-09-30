import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameLinkingOne extends Frame implements ActionListener{
	Button b1,b2,b3;
	public FrameLinkingOne(String str){
		super(str);
		setSize(500,500);
		setLocationRelativeTo(this);
		setLayout(new FlowLayout());
		setVisible(true);
		b1=new Button("New Frame");
		b2=new Button("Hide current Frame");
		b3=new Button("Exit");
		add(b1);add(b2);add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e){
		Button b=(Button)e.getSource();
		if(b==b1){
			new FrameLinkingTwo("Second Frame",this);
			dispose();
		}
		if(b==b2){
			setVisible(false);
		}
		if(b==b3){
			System.exit(0);
		}
	}
	public static void main(String[] args){
		new FrameLinkingOne("First Frame");
	}
}
