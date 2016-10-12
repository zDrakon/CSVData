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
		return null;
	}

	/***
	 * Returns all values of a column
	 * 
	 * @param columnName
	 *            the name of the column
	 * @return values of a column
	 */
	public double[] getColumn(String columnName) {
		return null;
	}

	/***
	 * Returns all values of a row
	 * 
	 * @param row
	 *            the row index
	 * @return values of a row
	 */
	public double[] getRow(int row) {
		return null;
	}

	/***
	 * Returns values of multiple rows
	 * 
	 * @param startRow
	 *            the starting row
	 * @param endRow
	 *            the ending row which won't be included in the return value
	 * @return values of multiple rows
	 */
	public double[][] getRows(int startRow, int endRow) {
		return null;
	}

	/***
	 * Returns values of multiple rows
	 * 
	 * @param rowIndexes
	 *            the desired row indexes
	 * @return values of multiple rows
	 */
	public double[][] getRows(int[] rowIndexes) {
		return null;
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
		return null;
	}

	/***
	 * Returns values of multiple cols
	 * 
	 * @param colIndexes
	 *            the desired cols indexes
	 * @return values of multiple cols
	 */
	public double[][] getCols(int[] colIndexes) {
		return null;
	}

	/***
	 * Sets an entire column with a set of values
	 * 
	 * @param columnIndex
	 * @param vals
	 */
	public void setColumn(int columnIndex, double[] vals) {

	}

	/***
	 * Sets an entire row with a set of values
	 * 
	 * @param rowIndex
	 * @param vals
	 */
	public void setRow(int rowIndex, double[] vals) {

	}

	/***
	 * Sets a specific value to a specific index
	 * 
	 * @param col
	 * @param row
	 * @param newValue
	 */
	public void setValue(int col, int row, double newValue) {

	}

	/***
	 * Saves to a file with the filename input
	 * 
	 * @param filename
	 */
	public static void saveToFile(String filename) {

	}
}
