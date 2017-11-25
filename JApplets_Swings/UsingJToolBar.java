
import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class UsingJToolBar extends JFrame{
	JSplitPane pane;
	public UsingJToolBar(String str){
		super(str);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pane=new JSplitPane();
		pane.setEnabled(false);
		pane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		add(pane);
	}
	public static void main(String[] args){
		new UsingJToolBar("Example").setVisible(true);
	}
}
