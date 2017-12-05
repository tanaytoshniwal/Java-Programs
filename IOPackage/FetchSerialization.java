import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FetchSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis=new FileInputStream("object.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		SampleSerialization obj1=(SampleSerialization)ois.readObject();
		SampleSerialization obj2=(SampleSerialization)ois.readObject();
		obj1.show();
		obj2.show();
	}
}
