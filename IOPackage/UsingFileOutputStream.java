import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {
	public static void main(String[] args) throws IOException{
		FileOutputStream file=new FileOutputStream("file.txt");
		String str="Hello World!";
		file.write(str.getBytes());
		file.close();
		System.out.println("File Created Successfully!");
	}
}