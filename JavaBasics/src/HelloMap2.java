import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HelloMap2 {
	public static void main(String[] args) {
		Map<Integer, Emp> empMap = new HashMap<Integer, Emp>();
		empMap.put(105, new Emp(105, "abc", 9000));
		empMap.put(103, new Emp(103, "def", 4000));
		empMap.put(102, new Emp(102, "xyz", 34000));
		empMap.put(104, new Emp(104, "pqr", 24000));
		empMap.put(106, new Emp(106, "ijk", 14000));
		
		System.out.println("Before Sorting....");
		Set<Entry<Integer, Emp>> entrySet = empMap.entrySet();
		for(Entry<Integer, Emp> entry : entrySet){
			System.out.println(entry.getKey() +"=>"+ entry.getValue());
		}
		
		Map<Integer, Emp> empTreeMap = new TreeMap<Integer, Emp>(empMap);
		
		System.out.println("\nAfter Sorting...");
		Set<Integer> keySet = empTreeMap.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()){
			Integer key = it.next();
			System.out.println(key +"=>"+empTreeMap.get(key));
		}
		
	}
}
