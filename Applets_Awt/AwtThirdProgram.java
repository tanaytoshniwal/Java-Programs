import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;

public class AwtFirst extends Applet{
	Label l1,l2;
	Button b1,b2;
	TextField t1,t2;
	TextArea ta;
	Checkbox c1,c2,c3;
	Checkbox c4,c5,c6;
	List list1,list2,list3;
	Choice c;
	@Override
	public void init() {
		setSize(700,500);
		setBackground(Color.CYAN);
		l1=new Label("Enter Username");
		l2=new Label("Enter Password");
		t1=new TextField(30);
		t2=new TextField(30);
		t2.setEchoChar('*');
		b1=new Button("SAVE");
		b2=new Button("QUIT");
		add(l1);add(t1);
		add(l2);add(t2);
		add(b1);add(b2);
		ta=new TextArea(10,20);
		add(ta);
		c1=new Checkbox("JAVA");
		c2=new Checkbox("JAVAEE");
		c3=new Checkbox("JAVAME");
		add(c1);add(c2);add(c3);
		
		CheckboxGroup obj=new CheckboxGroup();
		c4=new Checkbox("C", false, obj);
		c5=new Checkbox("C++", false, obj);
		c6=new Checkbox("C#", true, obj);
		add(c4);add(c5);add(c6);	
		
		list1=new List();
		list1.add("Item1");
		list1.add("Item2");
		list1.add("Item3");
		list1.add("Item4");
		list1.add("Item5");
		list1.add("Item6");
		list1.add("Item7");
		list1.add("Item8");
		list1.add("Item9");
		add(list1);
		
		list2=new List(9);
		list2.add("Item1");
		list2.add("Item2");
		list2.add("Item3");
		list2.add("Item4");
		list2.add("Item5");
		list2.add("Item6");
		list2.add("Item7");
		list2.add("Item8");
		list2.add("Item9");
		add(list2);
		
		list3=new List(9,true);
		list3.add("Item1");
		list3.add("Item2");
		list3.add("Item3");
		list3.add("Item4");
		list3.add("Item5");
		list3.add("Item6");
		list3.add("Item7");
		list3.add("Item8");
		list3.add("Item9");
		add(list3);
		
		c=new Choice();
		c.add("Item1");
		c.add("Item2");
		c.add("Item3");
		c.add("Item4");
		c.add("Item5");
		add(c);
	}
}
