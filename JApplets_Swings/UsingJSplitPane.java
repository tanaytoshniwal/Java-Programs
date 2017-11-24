import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class UsingJSplitPane extends JFrame{
	JSplitPane pane;
	public UsingJSplitPane(String str){
		super(str);
		setSize(getToolkit().getScreenSize());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pane=new JSplitPane();
		add(pane);
	}
	public static void main(String[] args){
		new UsingJSplitPane("Example").setVisible(true);
	}
}
