import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class UsingSequenceInputStream {
	public static void main(String[] args)throws IOException{
		FileInputStream fis1=new FileInputStream("hello.txt");
		FileInputStream fis2=new FileInputStream("world.txt");
		SequenceInputStream sis=new SequenceInputStream(fis1, fis2);
		FileOutputStream fos=new FileOutputStream("combined.txt");
		int i;
		while((i=sis.read())!=-1){
			fos.write(i);
			System.out.print((char)i);
		}
		fos.close();
		fis1.close();
		fis2.close();
		sis.close();
	}
}
