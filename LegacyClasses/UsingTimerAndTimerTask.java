import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask{
	@Override
	public void run(){
		System.out.println("Welcome to my Task!!!");
	}
}
public class UsingTimerAndTimerTask{
	public static void main(String[] args){
		Timer timer=new Timer();
		timer.schedule(new MyTask(), 3000, 500);
		try{
			Thread.sleep(9000);
		}
		catch(InterruptedException e){}
		timer.cancel();
		System.out.println("End Of Program");
	}
}