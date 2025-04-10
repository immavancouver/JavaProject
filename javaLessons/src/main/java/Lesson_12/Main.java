package Lesson_12;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String fileName = "data.csv";
		String[] header = {"Value 1", "Value 2", "Value 3"};
		int[][] data = {
				{100, 200, 123},
				{300, 400, 500}
		};

		AppData appDataToSave = new AppData(header, data);

		// Save data to CSV
		try {
			CSVWriter.save(appDataToSave, fileName);
		} catch (IOException e) {
			System.out.println("Error saving data");
		}

		// Load data from CSV
		try {
			AppData loadedData = CSVReader.load(fileName);
			for (String col : loadedData.getHeader()) {
				System.out.print(col + ";");
			}
			System.out.println();
			for (int[] row : loadedData.getData()) {
				for (int value : row) {
					System.out.print(value + ";");
				}
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println("Error loading data");
		}
	}
}
