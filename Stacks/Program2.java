import java.util.*;
class Program2{
	public static void main(String[] main){
		Stack<Integer> stack=new Stack<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		solveHanoi(n,'A','B','C');
		sc.close();
	}
	static void solveHanoi(int n,char source,char dest,char spare){
		if(n==1)
			System.out.println("from "+source+" to "+dest);
		else{
			solveHanoi(n-1,source,spare,dest);
			solveHanoi(1,source,dest,spare);
			solveHanoi(n-1,spare,dest,source);
		}
	}
}