import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("src/UsingFileReader.java");
		BufferedReader br=new BufferedReader(fr);
		String str="";
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		fr.close();
		br.close();
	}
}
