package lesson_7;

public class FillDiagonal {
	public static int[][] fillDiagonal(int size) {
		int[][] arr = new int[size][size];
		for (int i = 0; i < size; i++) {
			arr[i][i] = 1;
			arr[i][size - 1 - i] = 1;
		}
		return arr;
	}
}
