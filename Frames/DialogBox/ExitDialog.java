import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitDialog extends Dialog{
	Button b1,b2;
	public ExitDialog(Frame frm){
		super(frm);
		setLayout(new FlowLayout());
		setSize(300,150);
		setLocationRelativeTo(frm);
		Label label=new Label("Do you want to exit?");
		b1=new Button("Yes");
		b2=new Button("No");
		add(label);add(b1);add(b2);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
