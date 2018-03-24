import static org.junit.Assert.*;

import org.hissam.MemoryLeakStackWithWeakRefrence;
import org.junit.Test;

public class GlobalTest {

	@Test
	public void test() {
	}

	@Test
	public void primitiveNullPointer() {
		final Integer intObject = 42;
		assert (intObject == 42);
		try {
			final int newIntValue = methodWhichMayReturnNull(intObject);
			fail("Assignment of null to primitive should throw NPE");
		} catch (NullPointerException e) {
			System.out.println("asasas   " + e.getMessage());
		}
	}

	@Test
	public void arrayCopy() {
//		int[] integers = { 0, 1, 2, 3, 4 };
//		int[] newIntegersArray = new int[integers.length * 2];
//		System.arraycopy(integers, 2, newIntegersArray, 0, integers.length);
//		integers = newIntegersArray;
//		integers[5] = 5;
//		assertEquals(5, integers[5]);
	}

	private Integer methodWhichMayReturnNull(Integer intValue) {
		return null;
	}
	
	@Test
	public void weakReferenceStackManipulation() {
		final MemoryLeakStackWithWeakRefrence<ValueContainer> stack = new MemoryLeakStackWithWeakRefrence<>();
		final ValueContainer expected = new ValueContainer("Value for the stack");
		stack.push(new ValueContainer("Value for the stack"));
		ValueContainer peekedValue = stack.peek();
		assertEquals(expected, peekedValue);
		assertEquals(expected, stack.peek());
		peekedValue = null;
		System.gc();
		assertNull(stack.peek());
	}

}

class ValueContainer {
	private final String value;

	public ValueContainer(final String value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)return false;
		if(!(obj instanceof ValueContainer))return false;
		
		ValueContainer vc=(ValueContainer)obj;
		if(this.value.equals(vc.value))
			return true;
		return false;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.printf("Finalizing for [%s]%n", toString());
	}
	/* equals, hashCode and toString omitted */
}
