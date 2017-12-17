import java.util.Calendar;

public class UsingCalender {
	public static void main(String[] args){
		Calendar c=Calendar.getInstance();
		//System.out.println(c);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}
}
