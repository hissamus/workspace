import java.util.Comparator;
import java.util.Map;


public class EmpComparator3 implements Comparator<Integer>{

	private Map<Integer, Emp> empMap;

	public EmpComparator3(Map<Integer, Emp> empMap) {
		this.empMap = empMap;
	}

	@Override
	public int compare(Integer i1, Integer i2) {
		Emp e1 = empMap.get(i1);
		Emp e2 = empMap.get(i2);
		return (int)(e1.getSalary() - e2.getSalary());
	}

	

}
