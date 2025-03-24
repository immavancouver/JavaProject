package lesson_7;

public class MultiplySmallNumbers {
	public static void multiplyByTwo(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 6) {
				arr[i] *= 2;
			}
		}
	}
}
