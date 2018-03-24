

public class Test1 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hissam");
		StringBuffer sb2 = new StringBuffer("Hissam");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
	}
}
