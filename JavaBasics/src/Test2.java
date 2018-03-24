
// String class is immutable.

public class Test2 {
	public static void main(String[] args) {
		String msg = new String("Hello");
		msg.concat("World");
		//msg = msg.concat("World");
		System.out.println(msg);
		
		
		msg.toLowerCase();
		
		//msg = msg+"sss";
		System.out.println(msg);
		
	}
}
