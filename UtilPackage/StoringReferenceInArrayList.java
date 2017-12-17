import java.util.ArrayList;
import java.util.Scanner;

public class StoringReferenceInArrayList {
	public static void main(String[] args){
		ArrayList<Student> list=new ArrayList<>();
		Student[] stud=new Student[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			stud[i] = new Student(sc.nextInt(), sc.next());
			list.add(stud[i]);
		}
		System.out.println(list.size()+":::"+list);
	}
}
