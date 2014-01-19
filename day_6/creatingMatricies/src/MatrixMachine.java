
public class MatrixMachine{
	
	public static void main(String[]args) {
		
		
		Matrix aMatrix = new Matrix(3,3);
		//System.out.println(aMatrix.toString());
		aMatrix.setElement(2,2,288);
		aMatrix.setElement(2,1,287);
		aMatrix.setElement(2,0,286);
		
		aMatrix.setElement(1,0,4);
		aMatrix.setElement(1,1,5);
		aMatrix.setElement(1,2,6);

		aMatrix.setElement(0,0,1);
		aMatrix.setElement(0,1,2);
		aMatrix.setElement(0,2,3);
		System.out.println(aMatrix.toString());
		aMatrix.setRow(0,"0,0,0");
		aMatrix.setRow(1,"1,1,1");
		aMatrix.setRow(2,"2,2,2");
		System.out.println(aMatrix.toString());

		aMatrix.setColumn(1,"9,9,9");
		System.out.println(aMatrix.toString());
		System.out.println(aMatrix.prettyPrint());

		Matrix aMatrix2 = new Matrix(3,3);
		String arrayString = "1,2,3;4,5,6;7,8,9";
		aMatrix2.matrixSet(arrayString);
		

		int [] aArray1 = {1,2,3,4,3,5,2,1};
		
		int [] [] aArray2 = {{0,1,2,3},
				      {1,4,5,6},
				      {2,5,7,8},
				      {3,6,8,9}};

		int [] [] aArray3 = {{0,1,2,3},
				      {0,4,5,6},
				      {0,0,7,8},
				      {0,0,0,8}};	

		MatrixChecker aMatrixChecker = new MatrixChecker();
		System.out.println("It is *" + aMatrixChecker.isSymetrical(aArray1) + "* that the array is symetrical.");
		System.out.println("It is *" + aMatrixChecker.isSymetrical(aArray2) + "* that the 2D array is symetrical.");
		System.out.println("It is *" + aMatrixChecker.isTriangular(aArray3) + "* that the array is triangular.");
		
	}
}