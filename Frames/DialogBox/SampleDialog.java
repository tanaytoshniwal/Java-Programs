import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SampleDialog extends Frame{
	Button b1;
	public SampleDialog(){
		setLayout(new FlowLayout());
		setSize(500, 500);
		setLocationRelativeTo(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				ExitDialog dialog=new ExitDialog(SampleDialog.this);
				dialog.setVisible(true);
			}
		});
		b1=new Button("Exit");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args){
		SampleDialog obj=new SampleDialog();
		obj.setVisible(true);
	}
}
