/**
*Day 6 Excersice 3
* Main method
*/

public class Matrix {
	private int [] [] matrixArray;
	private int row;
	private int column;
	
	/**
	*Constructor method
	* This sets the size of the initial 2d array they do not have to be the same number
	* @param numberOfRows numberOfColumns, sets the size of the array
	*/
	public Matrix (int numberOfRows, int numberOfColumns) {
		this.matrixArray  = new int [numberOfRows] [numberOfColumns];
		setRow(numberOfRows);
		setColumn(numberOfColumns);
		for (int x = 0;  numberOfRows >x; x++){
			for (int y = 0; numberOfColumns >y;  y++){
				matrixArray [x] [y] = 1;
			}
		}
	}
	/**
	* Sets the elements in the array.
	*@param  row column number the first two integers take in the array index and the number is the number to be inserted
	*/
	public void setElement(int row, int column, int number) {
		if (row > getRow() || row < 0 || column > getColumn() || column < 0) {
			System.out.println("INVALID");
		}  else {
			//The index does exist so we have to add the number in the correct index
			for (int x = 0;  row >= x; x++){
				for (int y = 0; column >= y;  y++){
					if (row == x && column == y) {
						matrixArray [x] [y] = number;
					}	
				}
			}
		}
	}
	/**
	* Modifies one whole row of the 2D array. The number input must match the number of elements in the row or it cannot perform.
	*@param rowIndex , replacementNumbers takes in a row index and changes the whole row to the number string entered, providing it is a vailid input
	*/
	public void setRow(int rowIndex , String replacementNumbers) {
		int [] numberNoCommas = new int [getColumn()];
		int x = 0;		

		if (rowIndex > getRow()){
			System.out.println("Invalid: Row index bigger than row numbers.");
		} else {
			for(int y=0; replacementNumbers.length()-1 >= y; y++) { //0,1,2,3,4
				if (!replacementNumbers.substring(y, y +1).equals(",")) {
					int character = Integer.parseInt(replacementNumbers.substring(y, y+1));
					numberNoCommas[x] = character;
					x++;	
				} 
			}
			if (numberNoCommas.length > getColumn()) {
				System.out.println("invalid number of  elements in the string enterend!");
			} else {
				//find the row index, 
				for (int z = 0;  getRow() > z; z++ ) { //3
					if (rowIndex == z){
						for (int a = 0; getColumn() > a; a++) {
							matrixArray[z][a] = numberNoCommas[a];
						}
					}
				}
			}
		}
	}
	/**
	* Modifies one whole column the number input must match the number of elements in the column or it will terminate
	*@param columnIndex , replacementNumbers takes in a row index and changes the whole column to the number string entered, providing it is a vailid input
	*/
	public void setColumn(int columnIndex , String replacementNumbers) {
		int [] numberNoCommas = new int [getRow()];
		int x = 0;		

		if (columnIndex > getColumn()){
			System.out.println("Invalid: Row index bigger than row numbers.");
		} else {
			for(int y=0; replacementNumbers.length()-1 >= y; y++) { //0,1,2,3,4
				if (!replacementNumbers.substring(y, y +1).equals(",")) {
					int character = Integer.parseInt(replacementNumbers.substring(y, y+1));
					numberNoCommas[x] = character;
					x++;	
				} 
			}
			if (numberNoCommas.length > getRow()) {
				System.out.println("invalid number of  elements in the string enterend!");
			} else {
				for (int z = 0;  getColumn() > z; z++ ) { //3
					if (columnIndex == z){
						for (int n =0; getRow() > n; n++) {
						matrixArray[n][z] = numberNoCommas[n];
						}
					}
				}
			}
		}
	}

	public void matrixSet(String arrayString) {
		int row = 0;
		int column= 0;

		for (int x =0; arrayString.length()> x; x++) {
			if (!arrayString.substring(x,x+1).equals(",") && !arrayString.substring(x,x+1).equals(";")) {
				int number = Integer.parseInt(arrayString.substring(x,x+1));
				matrixArray [row][column] = number;
				System.out.println("Print! row:" + row + "   " + "x:" + column+ " " + "   Number:" + number );
			} else if (arrayString.substring(x,x+1).equals(";")) {
				row++;
				column = 0;
			} else if (arrayString.substring(x,x+1).equals(",")) {
				column++;
			}
		}
	}

	/**
	* Displays the content of the 2D array.
	*@return a String containing  the full 2D array.
	*/
	public String toString() {
		String result = "[";

		for (int x = 0;  getRow() > x; x++){
			for (int y = 0; getColumn() > y;  y++){
				result += matrixArray[x][y] + ";";
			}
		}
		return result + "]";
	}
	/**
	* Displays the content of the 2D array in rows and columns
	*@return a String that contians the 2D array in a neatly formatted form.
	*/
	public String prettyPrint() {
		String result = "*****";
		for (int x = 0;  getRow() > x; x++){
			result += "\n";
			for (int y = 0; getColumn() > y;  y++){
				result += matrixArray[x][y] + "";
			}
		}
		return result + "\n*****" ;
	}


	/**
	*setter for number of rows initialised in the 2D array.
	*@param row takes in the number of rows in the 2D array.
	*/
	public void setRow(int row) {
		this.row = row;
	}
	/**
	*setter for number of columns initialised in the 2D array.
	*@param column makes in the number of columns in the 2D array.
	*/
	public void setColumn(int column) {
		this.column = column;
	}
	/**
	*getter for number of rows in the 2D array.
	*@return int number of rows in the 2D array.
	*/
	public int getRow() {
		return row;
	}
	/**
	*getter for number of columns in the 2D array.
	*@return int number of columns in the 2D array.
	*/
	public int getColumn() {
		return column;
	}
}