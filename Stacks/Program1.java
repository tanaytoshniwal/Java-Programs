import java.util.*;
class Program1{
	public static void main(String[] main){
		Stack<Integer> stack=new Stack<>();
		Scanner sc=new Scanner(System.in);
		int n=10;
		while(n-->0)
			stack.push(sc.nextInt());
		Iterator<Integer> it=stack.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		sc.close();
	}
}