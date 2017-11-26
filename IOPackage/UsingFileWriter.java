import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {
	public static void main(String[] args) throws IOException{
		FileWriter file=new FileWriter("file2.txt");
		String str="Hello World!";
		file.write(str.toCharArray());
		file.close();
		System.out.println("File Created Successfully!");
	}
}
