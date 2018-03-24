import java.math.BigDecimal;


public class TestDouble {
	public static void main(String[] args) {
		//double d1 = 10;
		//double d2 = 8.8;
		//System.out.println(d1-d2);
		
		BigDecimal b1 = new BigDecimal("10.00");
		BigDecimal b2 = new BigDecimal("8.83");
		System.out.println(b1.subtract(b2));
		
	}
}
