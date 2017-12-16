import java.util.Scanner;
import java.util.TreeSet;

public class UsingTreeSet {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<10;i++)
			arr[i]=sc.nextInt();
		sc.close();
		TreeSet<Integer> set=new TreeSet<>();
		for(int i:arr){
			set.add(i);
		}
		System.out.println("TreeSet is : " + set);
	}
}
