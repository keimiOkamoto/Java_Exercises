public class MatrixChecker {
	
	/**
	*Takes in an array and checks if it's a palindrome
	*@param aArray  an array is taken in
	*@return boolean 
	**/
	public boolean isSymetrical(int [] aArray) {
		for(int x =0; aArray.length > x; x++) {
			if (aArray[x] == aArray[aArray.length-(x+1)]) {
				System.out.println(aArray[x] + " " + aArray[aArray.length-(x+1)]);
			} else {
				return false;	
			}
		} return true;
	}

	/**
	*Takes in a 2D array and checks if it's a palindrome
	*@param aArray 2D array is taken in
	*@return boolean 
	**/
	public boolean isSymetrical(int [] [] aArray) {
		for(int x =0; aArray.length > x; x++) {
			for (int y = 0; aArray.length > y; y++) {
				if (aArray[x] [y]== aArray[y] [x]) {
					System.out.println(aArray[x] [y] +"   "+ aArray[y] [x]);
				} else {
					return false;	
				}
			}
		} return true;
	} 
	/**
	*Takes a 2D array and checks if it a triangular matrix
	*@param aArray 2D array is taken in
	*@return boolean 
	**/
	public boolean isTriangular(int [] [] aArray) {
		for (int x = 0; aArray.length > x; x++) {
			for (int y = 0; aArray.length > y; y++) {
				if (x > y) {
					if(aArray[x] [y]== 0) {
						System.out.println("x:" + x +"   "+"y:"+ y);
					} else {
						return false;
					}
				}
			}
		} return true;

	}
}