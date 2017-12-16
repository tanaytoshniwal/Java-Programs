class Demo2<Temp1, Temp2>{
	Temp1 variable1;
	Temp2 variable2;
	Demo2(Temp1 variable1, Temp2 variable2){
		this.variable1=variable1;
		this.variable2=variable2;
	}
	void get(){
		System.out.println(variable1+":::"+variable2);
	}
}
public class Generics2 {
	public static void main(String[] args){
		Demo2<String, Integer> object1=new Demo2<>("hello",999);
		object1.get();

		Demo2<Integer, Float> object2=new Demo2<>(6, 9.9f);
		object2.get();

		Demo2 object3=new Demo2(6,9.9);
		object3.get();
	}
}
