public class FibGenarator {
	/**
	*Static method that calculates the n-th fibonacci number
	*@param Number 
	*@return int
	*/
	public static int fib (int n) {
		if ( (n == 1) || (n == 2) ) {
			return 1;
		} else {
			int result = fib (n - 1) + fib ( n - 2);
			return result;
		}
	}


	public static void printNumbers(int n) {
		if (n <= 0) {
			return;
		}
		System.out.println(n);
		printNumbers(n-2);
		printNumbers(n-3);
		System.out.println(n);
	}
}