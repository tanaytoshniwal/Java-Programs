import java.awt.LayoutManager;

import javax.swing.JFrame;

public class FrameProperty {
	public static void set(JFrame frame,String title,int w,int h,boolean resizable,LayoutManager layout,int closeoperation){
		frame.setTitle(title);
		frame.setSize(w,h);
		frame.setResizable(resizable);
		frame.setLayout(layout);
		frame.setDefaultCloseOperation(closeoperation);
	}
}
