import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class DemoClient {
	public static void main(String[] args) throws IOException{
		Socket clientSocket=null;
		BufferedReader br=null;
		try{
			clientSocket=new Socket(InetAddress.getLocalHost(),99);
			//System.out.println(InetAddress.getLocalHost());
			InputStream is=clientSocket.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));
		}
		catch(UnknownHostException e){
			e.printStackTrace();
			System.out.println("Unable to connect!");
		}
		String str="";
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
	}
}
