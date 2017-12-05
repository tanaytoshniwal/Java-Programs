import java.io.IOException;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile {
	public static void main(String[] args) throws IOException{
		RandomAccessFile obj=new RandomAccessFile("combined.txt", "rw");
		long length=obj.length();
		System.out.println("length of file is : "+length);
	}
}
