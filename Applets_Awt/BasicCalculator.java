import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class BasicCalculator extends Applet{
	Button button;
	Choice choice;
	TextField t1,t2,result;
	@Override
	public void init() {
		setSize(500,500);
		t1=new TextField(10);
		t2=new TextField(10);
		result=new TextField();
		result.setEditable(false);
		choice=new Choice();
		choice.add("---SELECT---");
		choice.add("+");
		choice.add("-");
		choice.add("*");
		choice.add("/");
		setBackground(Color.black);
		button=new Button("Calculate");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String str=choice.getSelectedItem();
				double a=Integer.parseInt(t1.getText());
				double b=Integer.parseInt(t2.getText());
				switch(str){
					case "*":{
						result.setText(a*b+"");
						break;
					}
					case "-":{
						result.setText(a-b+"");
						break;
					}
					case "+":{
						result.setText(a+b+"");
						break;
					}
					case "/":{
						try{
						result.setText(a/b+"");}
						catch(Exception e){
							result.setText("divide by zero exception");
						}
						break;
					}
					default:{
						result.setText("invalid choice");
					}
				}
			}
		});
		add(t1);
		add(choice);
		add(t2);
		add(button);
		add(result);
	}
	@Override
	public void destroy(){
		JOptionPane.showMessageDialog(this,"Thankyou!","Byeee!",JOptionPane.PLAIN_MESSAGE);
	}
}
