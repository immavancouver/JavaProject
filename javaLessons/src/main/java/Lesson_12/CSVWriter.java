package Lesson_12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
	public static void save(AppData data, String fileName) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write(String.join(";", data.getHeader()));
			writer.newLine();
			for (int[] row : data.getData()) {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < row.length; i++) {
					sb.append(row[i]);
					if (i < row.length - 1) {
						sb.append(";");
					}
				}
				writer.write(sb.toString());
				writer.newLine();
			}
		}
	}
}
