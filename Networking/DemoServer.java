import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoServer {
	public static void main(String[] args) throws IOException{
		ServerSocket serverSocket=null;
		try{
			serverSocket=new ServerSocket(99);
			System.out.println("Socket Ready! Waiting for Client to accept...");
		}
		catch(IOException e){
			e.printStackTrace();
			System.out.println("Port is Busy!");
			System.exit(1);
		}
		
		Socket client=serverSocket.accept();
		OutputStream os=client.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		
		String str="";
		System.out.println("Connection Established. Write \"quit\" to exit");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(!(str=br.readLine()).equalsIgnoreCase("quit")){
			dos.write(str.getBytes());
			dos.write(13);
			dos.flush();
		}
		dos.close();
	}
}
