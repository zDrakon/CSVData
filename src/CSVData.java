/****
 * A class to read/write numerical CSV files and allow easy access of data.
 * 
 * @author EvanYap
 *
 */
public class CSVData {
	private double[][] data;
	private String[] columnNames;

	public static CSVData readCSVFile(String filename, int numLinesToIgnore, String[] columnNames) {
		return null;
	}

	/***
	 * Returns a new double array for a file ignoring lines at the top. Uses the
	 * first row as the column names. All other data is stored as doubles
	 * 
	 * @param filename
	 *            the file to read
	 * @param numLinesToIgnore
	 *            number of lines at the top to ignore
	 * @return a double array for that file
	 */
	public static CSVData readCSVFile(String filename, int numLinesToIgnore) {
		return null;
	}

	public double[] getColumn(int col) {
		return null;
	}

	public double[] getColumn(String columnName) {
		return null;
	}

	public double[] getRow(int row) {
		return null;
	}

	public double[][] getRows(int startRow, int endRow) {
		return null;
	}

	public double[][] getRows(int[] rowIndexes) {
		return null;
	}

	public double[][] getCols(int startCol, int endCol) {
		return null;
	}

	public double[][] getCols(int[] colIndexes) {
		return null;
	}

	public void setColumn(int columnIndex, double[] vals) {

	}

	public void setRow(int rowIndex, double[] vals) {

	}

	public void setValue(int col, int row, double newValue) {

	}

	public static void saveToFile(String filename) {

	}
}
