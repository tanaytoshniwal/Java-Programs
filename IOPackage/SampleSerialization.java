import java.io.Serializable;

public class SampleSerialization implements Serializable{
	int roll;
	String name;
	public SampleSerialization(int roll, String name){
		this.roll=roll;
		this.name=name;
	}
	public void show(){
		System.out.println(roll+":::"+name);
	}
}