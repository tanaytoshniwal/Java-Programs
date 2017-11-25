import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class UsingTabbedPane extends JFrame{
	JSplitPane pane;
	public UsingTabbedPane(String str){
		super(str);
		setSize(getToolkit().getScreenSize());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pane=new JSplitPane();
		add(pane);
	}
	public static void main(String[] args){
		new UsingTabbedPane("Example").setVisible(true);
	}
}
