
public class BubbleSort {

	public static int[] sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				int tmp = array[i];
				array[i] = array[i - 1];
				array[i - 1] = tmp;
			}
		}

		return array;
	}

}
