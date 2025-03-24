package lesson_7;

public class SwapArrayValues {
	public static void swapValues(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i] == 0) ? 1 : 0;
		}
	}
}
