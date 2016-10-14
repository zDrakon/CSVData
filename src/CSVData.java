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

	/***
	 * Returns all values of a column
	 * 
	 * @param col
	 *            the column index
	 * @return values of a column
	 */
	public double[] getColumn(int col) {
		double[] colVals = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			colVals[i] = data[i][col];
		}
		return colVals;
	}

	/***
	 * Returns all values of a column
	 * 
	 * @param columnName
	 *            the name of the column
	 * @return values of a column
	 */
	public double[] getColumn(String columnName) {
		double[] colVals = new double[data.length];
		int colIndex = 0;

		for (int i = 0; i < columnNames.length; i++) {
			if (columnNames[i].equals(columnName)) {
				colIndex = i;
			}
		}

		for (int i = 0; i < data.length; i++) {
			colVals[i] = data[i][colIndex];
		}
		return colVals;
	}

	/***
	 * Returns all values of a row
	 * 
	 * @param row
	 *            the row index
	 * @return values of a row
	 */
	public double[] getRow(int row) {
		return data[row];
	}

	/***
	 * Returns values of multiple rows
	 * 
	 * @param startRow
	 *            the starting row
	 * @param endRow
	 *            the ending row which will be included in the return value
	 * @return values of multiple rows
	 */
	public double[][] getRows(int startRow, int endRow) {
		double[][] rows = new double[data[startRow].length][data[endRow].length];

		for (int row = startRow; row < endRow; row++) {
			for (int col = 0; col < data[startRow].length; col++) {
				rows[row][col] = data[row][col];
			}
		}

		return rows;
	}

	/***
	 * Returns values of multiple rows
	 * 
	 * @param rowIndexes
	 *            the desired row indexes
	 * @return values of multiple rows
	 */
	public double[][] getRows(int[] rowIndexes) {
		return getRows(rowIndexes[0], rowIndexes[rowIndexes.length - 1]);
	}

	/***
	 * Returns values of multiple cols
	 * 
	 * @param startCol
	 *            the starting col
	 * @param endCol
	 *            the ending col which won't be included in the return value
	 * @return values of multiple cols
	 */
	public double[][] getCols(int startCol, int endCol) {
		double[][] cols = new double[data.length][data.length];
		for (int row = 0; row < data.length; row++) {
			for (int col = startCol; col < endCol; col++) {
				cols[row][col] = data[row][col];
			}
		}
		return cols;
	}

	/***
	 * Returns values of multiple cols
	 * 
	 * @param colIndexes
	 *            the desired cols indexes
	 * @return values of multiple cols
	 */
	public double[][] getCols(int[] colIndexes) {
		return getCols(colIndexes[0], colIndexes[colIndexes.length - 1]);
	}

	/***
	 * Gets the columns with an input of a string array of the column names
	 * 
	 * @param columnNames
	 * @return 2d array of the columns
	 */
	public double[][] getCols(String[] columnNames) {
		double[][] cols = new double[data.length][data.length];
		for (int row = 0; row < data.length; row++) {
			for (int i = 0; i < columnNames.length; i++) {
				double[] vals = getColumn(columnNames[i]);
				cols[row][i] = vals[i];
			}
		}

		return cols;
	}

	/***
	 * Sets an entire column with a set of values
	 * 
	 * @param columnIndex
	 * @param vals
	 */
	public void setColumn(int columnIndex, double[] vals) {
		for (int row = 0; row < data.length; row++) {
			data[row][columnIndex] = vals[row];
		}

	}

	/***
	 * Sets an entire row with a set of values
	 * 
	 * @param rowIndex
	 * @param vals
	 */
	public void setRow(int rowIndex, double[] vals) {
		for (int col = 0; col < data.length; col++) {
			data[col][rowIndex] = vals[col];
		}
	}

	/***
	 * Sets a specific value to a specific index
	 * 
	 * @param col
	 * @param row
	 * @param newValue
	 */
	public void setValue(int col, int row, double newValue) {
		data[row][col] = newValue;
	}

	/***
	 * Saves to a file with the filename input
	 * 
	 * @param filename
	 */
	public static void saveToFile(String filename) {

	}

}
