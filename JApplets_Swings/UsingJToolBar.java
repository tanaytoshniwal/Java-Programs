
import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class UsingJToolBar extends JFrame{
	JSplitPane pane;
	public UsingJToolBar(String str){
		super(str);
		setSize(getToolkit().getScreenSize());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pane=new JSplitPane();
		pane.setEnabled(false);
		pane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		pane.setLeftComponent(new JToolBarPanel());
		add(pane);
	}
	public static void main(String[] args){
		new UsingJToolBar("Example").setVisible(true);
	}
}
