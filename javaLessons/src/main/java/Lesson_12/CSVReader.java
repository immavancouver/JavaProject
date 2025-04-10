package Lesson_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
	public static AppData load(String fileName) throws IOException {
		List<String[]> rows = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				rows.add(line.split(";"));
			}
		}
		String[] header = rows.get(0);
		int[][] data = new int[rows.size() - 1][];
		for (int i = 1; i < rows.size(); i++) {
			String[] row = rows.get(i);
			data[i - 1] = new int[row.length];
			for (int j = 0; j < row.length; j++) {
				data[i - 1][j] = Integer.parseInt(row[j]);
			}
		}
		return new AppData(header, data);
	}
}
