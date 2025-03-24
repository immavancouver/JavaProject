package lesson_7;

public class Main {
	public static void main(String[] args) {
		// Task 1: Check if sum is between 10 and 20
		System.out.println("Task 1: " + SumInRange.isSumInRange(5, 15));

		// Task 2: Determine if a number is positive or negative
		PositiveOrNegative.checkNumber(-10);
		PositiveOrNegative.checkNumber(0);

		// Task 3: Check if a number is negative
		System.out.println("Task 3: " + IsNegative.isNegative(-5));

		// Task 4: Print a string multiple times
		PrintStringMultipleTimes.printString("Hello", 3);

		// Task 5: Leap year checker
		System.out.println("Task 5: " + LeapYearChecker.isLeapYear(2024));

		// Task 6: Swap 0 to 1 and 1 to 0 in an array
		int[] arr1 = {1, 1, 0, 0, 1, 0};
		SwapArrayValues.swapValues(arr1);
		System.out.print("Task 6: ");
		for (int num : arr1) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Task 7: Fill an array with values from 1 to 100
		int[] filledArray = FillArray.fillArray();
		System.out.print("Task 7: First 10 elements: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(filledArray[i] + " ");
		}
		System.out.println();

		// Task 8: Multiply numbers smaller than 6 by 2
		int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		MultiplySmallNumbers.multiplyByTwo(arr2);
		System.out.print("Task 8: ");
		for (int num : arr2) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Task 9: Fill diagonal elements of a square 2D array
		int[][] diagonalArray = FillDiagonal.fillDiagonal(5);
		System.out.println("Task 9:");
		for (int[] row : diagonalArray) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

		// Task 10: Create an array with repeated initial value
		int[] initialValueArray = CreateArrayWithInitialValue.createArray(5, 42);
		System.out.print("Task 10: ");
		for (int num : initialValueArray) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Task 11: Shift elements of an array cyclically
		int[] arr3 = {1, 2, 3, 4, 5};
		ShiftArray.shiftArray(arr3, 2);
		System.out.print("Task 11: ");
		for (int num : arr3) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
