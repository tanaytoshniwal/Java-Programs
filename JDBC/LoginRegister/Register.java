import javax.swing.JFrame;

public class Register extends JFrame{
	
	public Register(String str){
		super(str);
		setSize(500,500);
		setLocationRelativeTo(this);
		setResizable(false);
		
	}
	public static void main(String[] args){
		new Register("Register Frame").setVisible(true);
	}
}
