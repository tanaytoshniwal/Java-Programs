import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos=new FileOutputStream("data.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(100);
		dos.writeDouble(11.11);
		dos.writeByte(1);
		dos.writeChar(65);
		dos.writeBoolean(true);
		dos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream("data.txt");
		/*int i;
		while((i=fis.read())!=-1)
			System.out.print((char)i);*/
		System.out.println();
		DataInputStream dis=new DataInputStream(fis);
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		
	}
}
