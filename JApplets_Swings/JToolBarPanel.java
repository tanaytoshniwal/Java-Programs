import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;
public class JToolBarPanel extends JPanel{
	JToolBar toolbar;
	JButton b1,b2,b3,b4,b5,b6;
	public JToolBarPanel(){
		b1=new JButton(new ImageIcon("dna.jpg"));
		b2=new JButton(new ImageIcon("dna.jpg"));
		b3=new JButton(new ImageIcon("dna.jpg"));
		b4=new JButton(new ImageIcon("dna.jpg"));
		b5=new JButton(new ImageIcon("dna.jpg"));
		b6=new JButton(new ImageIcon("dna.jpg"));
		toolbar=new JToolBar();
		toolbar.add(b1);
		toolbar.add(b2);
		toolbar.add(b3);
		toolbar.add(b4);
		toolbar.add(b5);
		toolbar.add(b6);
		
		add(toolbar);
		toolbar.setEnabled(false);
		toolbar.setOrientation(JToolBar.VERTICAL);
	}
}
