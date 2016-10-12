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
	 * Returns a new CSVData object for a file ignoring lines at the top. Uses
	 * the first row as the column names. All other data is stored as doubles
	 * 
	 * @param filename
	 *            the file to read
	 * @param numLinesToIgnore
	 *            number of lines at the top to ignore
	 * @return a CSVData object for that file
	 */
	public static CSVData readCSVFile(String filename, int numLinesToIgnore) {
		return null;
	}

	/***
	 * Returns a 1d array representing a column of the 2d array arr.
	 * 
	 * @param arr
	 *            the 2d array to extract column from.
	 * @param column
	 *            the index of the column to extract
	 * @return a 1d array that's a copy of the column at index column.
	 */
	public static double[][] getColumn(double[][] arr, int column) {
		return null;
	}

	/***
	 * Returns a 1d array representing a row of the 2d array arr.
	 * 
	 * @param arr
	 *            the 2d array to extract row from.
	 * @param column
	 *            the index of the row to extract
	 * @return a 1d array that's a copy of the row at index row.
	 */
	public static double[][] getRow(double[][] arr, int row) {
		return null;
	}

	/***
	 * Returns a 2d array representing the rows of arr starting with startRow up
	 * to but not including endRow
	 * 
	 * @param arr
	 *            the array to extract rows from
	 * @param startRow
	 *            index of starting row
	 * @param endRow
	 *            index of ending row (return value does not include this row)
	 * @return a 2d array whose size is (endRow-startRow) by arr[0].length that
	 *         represents the row of arr starting with startRow up to but not
	 *         including endRow
	 */
	public static double[][] getRows(double[][] arr, int startRow, int endRow) {
		return null;
	}

	/***
	 * Returns a 2d array representing the rows of arr starting with startCol up
	 * to but not including endCol
	 * 
	 * @param arr
	 *            the array to extract columns from
	 * @param startRow
	 *            index of starting columns
	 * @param endRow
	 *            index of ending columns (return value does not include this
	 *            row)
	 * @return a 2d array whose size is (endColumns-startColumns) by
	 *         arr[0].length that represents the columns of arr starting with
	 *         startColumns up to but not including endColumns
	 */
	public static double[][] getCols(double[][] arr, int startCol, int endCol) {
		return null;
	}

	/***
	 * Copies all values from vals[] array into the column in arr given by the
	 * index variable colummnIndex
	 * 
	 * @param arr
	 *            the array to replace values for
	 * @param columnIndex
	 *            the index for the column whose values you're going to replace
	 * @param vals
	 *            the values to be copied into arr column at columnIndex
	 */
	public static void setColumn(double[][] arr, int columnIndex, double[] vals) {

	}

	/***
	 * Copies all values from vals[] array into the column in arr given by the
	 * index variable rowIndex
	 * 
	 * @param arr
	 *            the array to replace values for
	 * @param columnIndex
	 *            the index for the row whose values you're going to replace
	 * @param vals
	 *            the values to be copied into arr row at rowIndex
	 */
	public static void setRow(double[][] arr, int rowIndex, double[] vals) {
	}
}
