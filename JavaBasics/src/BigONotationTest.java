public class BigONotationTest {

	public BigONotationTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int CompareSmallestNumber(int array[]) {
		int x, curMin;

		// set smallest value to first item in array
		curMin = array[0];

		/*
		 * iterate through array to find smallest value and also assume there
		 * are only 10 elements
		 */
		for (x = 1; x < 10; x++) {
			if (array[x] < curMin) {
				curMin = array[x];
			}
		}

		// return smallest value in the array
		return curMin;
	}

}
