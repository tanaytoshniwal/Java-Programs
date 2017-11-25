import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ThirdProgram extends JFrame{
	JList<String> list;
	JComboBox cb;
	JScrollPane pane;
	public ThirdProgram(String str){
		super(str);
		setSize(500,500);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		String[] val={"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7","Item 8","Item 9"};

		list=new JList(val);
		DefaultListModel<String> v=(DefaultListModel)list.getModel();

		v.addElement("asdasd");
		pane=new JScrollPane(list);
		add(pane);
		
		cb=new JComboBox(val);
		add(cb);
	}
	public static void main(String[] args){
		new ThirdProgram("third").setVisible(true);
	}
}
