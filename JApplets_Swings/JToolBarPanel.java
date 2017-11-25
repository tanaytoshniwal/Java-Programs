import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class JToolBarPanel extends JPanel{
	JToolBar toolbar;
	JButton b1,b2,b3,b4,b5,b6;
	public JToolBarPanel(){
		b1=new JButton("");
		b2=new JButton("");
		b3=new JButton("");
		b4=new JButton("");
		b5=new JButton("");
		b6=new JButton("");
		toolbar=new JToolBar();
		toolbar.add(b1);
		toolbar.add(b2);
		toolbar.add(b3);
		toolbar.add(b4);
		toolbar.add(b5);
		toolbar.add(b6);
		add(toolbar);
		toolbar.setOrientation(JToolBar.VERTICAL);
	}
}
