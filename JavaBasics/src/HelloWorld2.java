
public class HelloWorld2 {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		//s1= s2;
		
		System.out.println(s1 == s2); // checks reference/address
		System.out.println(s1.equals(s2)); // checks content 
		System.out.println("-------------------------");
		
		Emp e1 = new Emp(101,"ABC");
		Emp e2 = new Emp(101,"ABC");
		System.out.println(e1 == e2 );
		System.out.println(e1.equals(e2));
		
		System.out.println("--------------------------");
		
		
		
		
		
		int x = 100; int y = 100;
		System.out.println(x == y);
		Integer a = new Integer(10), b = new Integer(10);
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		
	}
}
