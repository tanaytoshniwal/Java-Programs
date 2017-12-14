class Demo<Temp>{
	Temp variable;
	Demo(Temp variable){
		this.variable=variable;
	}
	Temp get(){
		return variable;
	}
}
public class Generics {
	public static void main(String[] args){
		Demo<String> object1=new Demo<>("hello");
		System.out.println(object1.get());
		
		Demo<Integer> object2=new Demo<Integer>(9);
		System.out.println(object2.get());
		
		Demo object3=new Demo(10.5);
		System.out.println(object3.get());
	}
}
