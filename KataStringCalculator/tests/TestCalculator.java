import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hissam.tom.Calculator;

import junit.extensions.TestDecorator;

public class TestCalculator {

	private static Calculator calculator;
	
	@BeforeClass
	public static void init() {
		calculator=new Calculator();
	}
	
	@AfterClass
	public static void destroy() {
		calculator=null;
	}

	@Test
	public void emptyStringReturnZero() throws Exception {
	
		assertEquals(0, calculator.calculate(""));
	}
	
	@Test
	public void singleValueIsReplied() throws Exception {
		assertEquals(1, calculator.calculate("1"));
	}
	
	@Test
	public void twoNumberSum() {
		assertEquals(3, calculator.calculate("1,2"));
	}
	

}
