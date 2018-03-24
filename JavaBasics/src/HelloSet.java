import java.util.HashSet;
import java.util.Set;


public class HelloSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("xyz");
		set.add("abc");
		set.add("pqr");
		set.add("ijk");
		set.add("def");
		
		set.add("abc");
		set.add(null);
		
		for(String s : set){
			System.out.println(s);
		}
	}
}
