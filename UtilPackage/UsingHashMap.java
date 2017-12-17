import java.util.HashMap;
import java.util.Set;

public class UsingHashMap {
	public static void main(String[] args){
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "asd");
		map.put(2, "asdasd");
		map.put(3, "asdasdasd");
		map.put(4, "asdasdasdasd");
		map.put(5, "asdasdasdasdasd");
		System.out.println(map);
		
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		for(int i:keySet){
			System.out.println(i+":::"+map.get(i));
		}
	}
}
