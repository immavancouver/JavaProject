package lesson_7;

public class ShiftArray {
	public static void shiftArray(int[] arr, int n) {
		int length = arr.length;
		n = n % length;
		if (n < 0) {
			n += length;
		}

		reverse(arr, 0, length - 1);
		reverse(arr, 0, n - 1);
		reverse(arr, n, length - 1);
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
