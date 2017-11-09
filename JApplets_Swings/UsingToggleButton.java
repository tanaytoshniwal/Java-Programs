import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class UsingToggleButton extends JFrame{
	public UsingToggleButton(String s){
		super(s);
		setSize(500,500);
		setLocationRelativeTo(this);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JToggleButton btn=new JToggleButton("RED");
		add(btn);
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(btn.isSelected()){
					getContentPane().setBackground(Color.RED);
					btn.setText("GREEN");
				}
				else{
					getContentPane().setBackground(Color.GREEN);
					btn.setText("RED");
				}
			}
		});
	}
	public static void main(String[] args){
		new UsingToggleButton("toggle").setVisible(true);
	}
}
