import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class UsingTabbedPane extends JFrame{
	JSplitPane pane;
	JTabbedPane tabpane;
	public UsingTabbedPane(String str){
		super(str);
		setSize(getToolkit().getScreenSize());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pane=new JSplitPane();
		add(pane);
		tabpane=new JTabbedPane();
		tabpane.addTab("Tab1", new Tab1());
		tabpane.addTab("Tab2", new Tab2());
		tabpane.addTab("Tab3", new Tab1());
		pane.setRightComponent(tabpane);
	}
	public static void main(String[] args){
		new UsingTabbedPane("Example").setVisible(true);
	}
}
