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
}