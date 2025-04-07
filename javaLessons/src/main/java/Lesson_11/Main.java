package Lesson_11;

public class Main {
	public static void main(String[] args) {
		String[][] validArray = {
				{"1", "2", "3", "4"},
				{"5", "6", "7", "8"},
				{"9", "10", "11", "12"},
				{"13", "14", "15", "16"}
		};

		String[][] invalidSizeArray = {
				{"1", "2", "3"},
				{"4", "5", "6"}
		};

		String[][] invalidDataArray = {
				{"1", "2", "3", "4"},
				{"5", "6", "seven", "8"},
				{"9", "10", "11", "12"},
				{"13", "14", "15", "16"}
		};

		try {
			System.out.println("Result for validArray: " + processArray(validArray));
		} catch (MyArraySizeException | MyArrayDataException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Result for invalidSizeArray: " + processArray(invalidSizeArray));
		} catch (MyArraySizeException | MyArrayDataException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Result for invalidDataArray: " + processArray(invalidDataArray));
		} catch (MyArraySizeException | MyArrayDataException e) {
			System.out.println(e.getMessage());
		}
	}

	public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
		if (array.length != 4 || array[0].length != 4) {
			throw new MyArraySizeException("Array size is not 4x4");
		}

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				try {
					sum += Integer.parseInt(array[i][j]);
				} catch (NumberFormatException e) {
					throw new MyArrayDataException(i, j);
				}
			}
		}

		return sum;
	}
}
