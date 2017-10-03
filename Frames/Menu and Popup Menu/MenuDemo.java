import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class MenuDemo extends Frame{
	MenuBar menuBar;
	Menu menu1,menu2;
	MenuItem item1,item2,item3,item4,item5,item6;
	public MenuDemo(String str){
		super(str);
		setSize(500,500);
		setLocationRelativeTo(this);
		setVisible(true);
		setResizable(false);
		
		menuBar=new MenuBar();
		setMenuBar(menuBar);
		
		menu1=new Menu("File");
		item1=new MenuItem("Open");
		item2=new MenuItem("New");
		item3=new MenuItem("Save");
		menu1.add(item1);
		menu1.addSeparator();
		menu1.add(item2);
		menu1.addSeparator();
		menu1.add(item3);
		
		menu2=new Menu("File");
		item4=new MenuItem("Cut");
		item5=new MenuItem("Copy");
		item6=new MenuItem("Paste");
		menu2.add(item4);
		menu2.addSeparator();
		menu2.add(item5);
		menu2.addSeparator();
		menu2.add(item6);
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);;
			}
		});
	}
	public static void main(String[] args){
		MenuDemo obj=new MenuDemo("Demo");
	}
}