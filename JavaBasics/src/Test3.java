
// String class is immutable.
// StringBuffer & StringBuilder(from JDK1.5) are mutable.
// StringBuffer is synchronized(thread safe) but StringBuilder not
// StringBuilder operations are faster than that of StringBuffer
public class Test3 {
	public static void main(String[] args) {
		//StringBuffer msg = new StringBuffer("Hello");
		StringBuilder msg = new StringBuilder("Hello");
		msg.append("World");
		
		System.out.println(msg);
		
		
	}
}
