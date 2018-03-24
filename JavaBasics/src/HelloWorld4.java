

public class HelloWorld4 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp e1 = new Emp(101,"ABC");
		System.out.println(e1);
		
		Emp e2 = (Emp) e1.clone();
		System.out.println(e2);
		
		System.out.println(e1.getEmpName() == e2.getEmpName());
		
	}
	
	
}
