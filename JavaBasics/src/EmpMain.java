import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;


public class EmpMain {
	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp(105, "abc", 9000));
		empList.add(new Emp(103, "def", 4000));
		empList.add(new Emp(102, "xyz", 34000));
		empList.add(new Emp(104, "pqr", 24000));
		empList.add(new Emp(106, "ijk", 14000));
		
		System.out.println("Before Sorting...");
		for(Emp e : empList){
			System.out.println(e);
		}
		int sortType = Integer.parseInt(JOptionPane.showInputDialog("Enter sort type (1 for Id, 2 for name, 3 for salary"));
		EmpComparator ec =new EmpComparator(1);
		switch(sortType){
		case 1:
			ec.setSortType(1);
			break;
		case 2:
			ec.setSortType(2);
			break;
		case 3:
			ec.setSortType(3);
		}
		Collections.sort(empList,ec);
	
		
		System.out.println("After Sorting...");
		for(Emp e : empList){
			System.out.println(e);
		}
		
	}
}
