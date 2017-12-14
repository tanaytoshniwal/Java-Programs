class Demo3<Temp extends Number>{
	Temp variable;
	Demo3(Temp variable){
		this.variable=variable;
	}
	Temp get(){
		return variable;
	}
}
public class Generics3 {
	public static void main(String[] args){
		/*Demo3<String> object1=new Demo3<>("hello");
		System.out.println(object1.get());*/
		
		Demo3<Integer> object2=new Demo3<Integer>(9);
		System.out.println(object2.get());
		
		Demo3 object3=new Demo3(10.5);
		System.out.println(object3.get());
	}
}
