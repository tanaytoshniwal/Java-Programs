import java.util.StringTokenizer;

public class UsingStringTokenizer {
	public static void main(String[] args){
		String s="hello;abcd=asdf)(fasdfn";
		StringTokenizer token=new StringTokenizer(s,";=()");
		System.out.println(token.countTokens());
		while(token.hasMoreTokens()){
			System.out.println(token.nextToken());
		}
	}
}
