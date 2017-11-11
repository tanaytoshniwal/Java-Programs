import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class UsingSwingMenus extends JFrame{
	JMenuBar bar;
	JMenu m1,m2;
	JMenuItem i1,i2,i3,i4,i5,i6;
	JCheckBoxMenuItem i7,i8,i9;
	JRadioButtonMenuItem i10,i11,i12;
	ButtonGroup grp;
	public UsingSwingMenus(String str){
		super(str);
		setSize(500,500);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		bar=new JMenuBar();
		setJMenuBar(bar);
		m1=new JMenu("File");
		bar.add(m1);
		m2=new JMenu("Edit");
		bar.add(m2);
		i1=new JMenuItem("Item1");
		i2=new JMenuItem("Item2");
		i3=new JMenuItem("Item3");
		i4=new JMenuItem("Item4");
		i5=new JMenuItem("Item5");
		i6=new JMenuItem("Item6");
		i7=new JCheckBoxMenuItem("Item7");
		i8=new JCheckBoxMenuItem("Item8");
		i9=new JCheckBoxMenuItem("Item9");
		i10=new JRadioButtonMenuItem("Item10");
		i11=new JRadioButtonMenuItem("Item11");
		i12=new JRadioButtonMenuItem("Item12");
		m1.add(i1);
		m1.addSeparator();
		m1.add(i2);
		m1.addSeparator();
		m1.add(i3);
		m1.addSeparator();
		m1.add(i7);
		m1.addSeparator();
		m1.add(i8);
		m1.addSeparator();
		m1.add(i9);
		
		grp=new ButtonGroup();
		grp.add(i10);
		grp.add(i11);
		grp.add(i12);
		
		m2.add(i4);
		m2.addSeparator();
		m2.add(i5);
		m2.addSeparator();
		m2.add(i6);
		m2.addSeparator();
		m2.add(i10);
		m2.addSeparator();
		m2.add(i11);
		m2.addSeparator();
		m2.add(i12);
	}
	public static void main(String[] args){
		new UsingSwingMenus("Using Menus").setVisible(true);
	}
}
