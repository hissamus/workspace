
public class HelloWorld5 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp e1= new Emp(101,"ABC");
		Address a1 = new Address("Pune", 411057);
		e1.setAddress(a1);
		
		Emp e2 = (Emp) e1.clone();
		
		e2.getAddress().setCity("Changed City");
		
		System.out.println(e1.getAddress() == e2.getAddress());
		
		
		
	}
}
