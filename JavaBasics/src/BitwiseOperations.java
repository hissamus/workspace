
public class BitwiseOperations {

	public BitwiseOperations() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a = 3;//4=100//60;	/* 60 = 0011 1100 */  
	     int b =7;// 8=1000;	/* 13 = 0000 1101 */
	     int c = 0;

	     c = a & b;       /* 12 = 0000 1100 */ 
	     System.out.println("a & b = " + c );

	     c = a | b;       /* 61 = 0011 1101 */
	     System.out.println("a | b = " + c );

	     c = a ^ b;       /* 49 = 0011 0001 */
	     System.out.println("a ^ b = " + c );

	     c = ~a;          /*-61 = 1100 0011 */
	     System.out.println("~a = " + c );

	     c = a << 2;     /* 240 = 1111 0000 */
	     System.out.println("a << 2 = " + c );

	     c = a >> 2;     /* 215 = 1111 */
	     System.out.println("a >> 2  = " + c );

	     c = a >>> 2;     /* 215 = 0000 1111 */
	     System.out.println("a >>> 2 = " + c );
	}
}
