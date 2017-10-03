import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PopupMenuDemo extends Frame{
	PopupMenu menu;
	MenuItem item1,item2,item3;
	public PopupMenuDemo(String str){
		super(str);
		setSize(500,500);
		setLocationRelativeTo(this);
		setVisible(true);
		setResizable(false);
		
		menu=new PopupMenu();
		item1=new MenuItem("Item 1");
		item2=new MenuItem("Item 2");
		item3=new MenuItem("Item 3");
		menu.add(item1);
		menu.addSeparator();
		menu.add(item2);
		menu.addSeparator();
		menu.add(item3);
		add(menu);
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e){
				if(e.getButton()==MouseEvent.BUTTON3){
					menu.show(PopupMenuDemo.this, e.getX(), e.getY());
				}
			}
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);;
			}
		});
	}
	public static void main(String[] args){
		PopupMenuDemo obj=new PopupMenuDemo("Demo");
	}
}