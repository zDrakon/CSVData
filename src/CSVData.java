import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/****
 * A class to read/write numerical CSV files and allow easy access of data.
 * 
 * @author EvanYap
 *
 */
public class CSVData {
	private double[][] data;
	private String[] columnNames;
	private String filePathToCSV;
	private int numRows;
	private int numColumns;

	public CSVData(String filepath, String[] columnNames, int startRow) {
		this.filePathToCSV = filepath;
		this.numColumns = data.length;

		String dataString = readFileAsString(filepath);
		String[] lines = dataString.split("\n");

		// number of data points
		int n = lines.length - startRow;
		this.numRows = n;

		// create storage for column names
		this.columnNames = columnNames;

		// create storage for data
		this.data = new double[n][numColumns];
		for (int i = 0; i < lines.length - startRow; i++) {
			String line = lines[startRow + i];
			String[] coords = line.split(",");
			for (int j = 0; j < numColumns; j++) {
				if (coords[j].endsWith("#"))
					coords[j] = coords[j].substring(0, coords[j].length() - 1);
				double val = Double.parseDouble(coords[j]);
				data[i][j] = val;
			}
		}
	}

	private String readFileAsString(String filepath) {
		StringBuilder output = new StringBuilder();
		try (Scanner scanner = new Scanner(new File(filepath))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				output.append(line + System.getProperty("line.separator"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output.toString();
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
		double[][] rows = new double[endRow - startRow][data[0].length];

		for (int row = startRow; row < endRow; row++) {
			int index = 0;
			for (int col = 0; col < data[startRow].length; col++) {
				rows[index][col] = data[row][col];
				index++;
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
		double[][] cols = new double[data.length][endCol - startCol];
		for (int row = 0; row < data.length; row++) {
			int index = 0;
			for (int col = startCol; col < endCol; col++) {
				cols[row][index] = data[row][col];
				index++;
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
		double[][] cols = new double[data.length][colIndexes.length];
		for (int row = 0; row < data.length; row++) {
			int index = 0;
			for (int col = colIndexes[0]; col < colIndexes[colIndexes.length - 1]; col++) {
				cols[row][index] = col;
			}
		}

		return cols;
	}

	/***
	 * Gets the columns with an input of a string array of the column names
	 * 
	 * @param columnNames
	 * @return 2d array of the columns
	 */
	public double[][] getCols(String[] columnNames) {
		double[][] cols = new double[data.length][columnNames.length];
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
