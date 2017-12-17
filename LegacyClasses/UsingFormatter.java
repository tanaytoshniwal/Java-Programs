import java.util.Formatter;

public class UsingFormatter {
	public static void main(String[] args){
		Formatter fmt=new Formatter();
		fmt.format("%d , %s , %.2f", 10, "hello", 333.33333);
		System.out.println(fmt);
	}
}
