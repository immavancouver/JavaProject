package lesson_7;

public class FillArray {
	public static int[] fillArray() {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}
}
