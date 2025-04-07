package Lesson_11;

public class MyArrayDataException extends Exception {
	private int row;
	private int col;

	public MyArrayDataException(int row, int col) {
		super("Invalid data in cell [" + row + "][" + col + "]");
		this.row = row;
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
}
