
public class HelloWorld3 {
	// If two objects are equal their hashCode() should be same.
	// But, the reverse is not true.
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() == s2.hashCode());
		
		Emp e1 = new Emp(101,"ABC");
		Emp e2 = new Emp(101,"ABC");
		System.out.println("e1.equals(e2):"+e1.equals(e2));
		System.out.println("e1.hashCode()==e2.hashCode():"+(e1.hashCode() == e2.hashCode() ));
		
		System.out.println(e1.hashCode());
	}
}
