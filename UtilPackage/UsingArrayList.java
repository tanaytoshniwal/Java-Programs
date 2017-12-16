import java.util.ArrayList;
import java.util.Scanner;

public class UsingArrayList {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		while(sc.hasNext()){
			list.add(sc.nextInt());
		}
	}
}
