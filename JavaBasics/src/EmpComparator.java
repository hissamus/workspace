import java.util.Comparator;


public class EmpComparator implements Comparator<Emp>{

	private int sortType;
	private boolean sortOrder = true; // true for asceding , false for descending
	public EmpComparator(int sortType){
		this.sortType = sortType;
	}
	
	@Override
	public int compare(Emp e1, Emp e2) {
		if(sortType == 1){ // ID
			return e1.getEmpId() - e2.getEmpId();
		}else if(sortType == 2){ // NAMe
			return e1.getEmpName().compareTo(e2.getEmpName());
		}else if(sortType == 3){ // SALARY
			return (int)(e1.getSalary() - e2.getSalary());
		}
		return 0;
	}

	public void setSortType(int sortType) {
		this.sortType = sortType;
	}
	
	

}
