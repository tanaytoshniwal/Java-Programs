import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StoreSerialization {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos=new FileOutputStream("object.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		SampleSerialization obj1=new SampleSerialization(101, "name 1");
		SampleSerialization obj2=new SampleSerialization(102, "name 2");
		oos.writeObject(obj1);
		oos.writeObject(obj2);
		oos.close();
		fos.close();
	}
}
