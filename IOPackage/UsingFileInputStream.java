import java.io.IOException;
import java.io.FileInputStream;

public class UsingFileInputStream{
	public static void main(String[] main) throws IOException{
		FileInputStream fis=new FileInputStream("file.txt");
		int i;
		while((i=fis.read())!=-1){
			System.out.print((char)i);
		}
		fis.close();
	}
}