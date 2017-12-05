import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile {
	public static void main(String[] args) throws IOException{
		RandomAccessFile obj=new RandomAccessFile("combined.txt", "rw");
		long length=obj.length();
		System.out.println("length of file is : "+length);
		obj.seek(length);
		System.out.println("wirte your message:");
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String input=reader.readLine();
		obj.write(13);
		obj.write(input.getBytes());
		obj.close();
		reader.close();
		System.out.println("Done!");
	}
}
