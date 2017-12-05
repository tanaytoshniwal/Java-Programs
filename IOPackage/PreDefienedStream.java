import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class PreDefienedStream {
	public static void main(String[] args) throws IOException{
		PrintStream ps=System.out;
		ps.println("hello there!");
		
		ps.println("Input a character:");
		InputStream is=System.in;
		char ch=(char)is.read();
		ps.println("Your character is : "+ch);
	}
}
