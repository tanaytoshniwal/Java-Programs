//<applet code="DemoApplet" width="500" height="500"></applet>
import java.applet.Applet;
public class DemoApplet extends Applet{
	@Override
	public void init(){
		System.out.println("init");
	}
	@Override
	public void start(){
		System.out.println("start");
	}
	@Override
	public void stop(){
		System.out.println("stop");
	}
	@Override
	public void destroy(){
		System.out.println("destroy");
	}
}