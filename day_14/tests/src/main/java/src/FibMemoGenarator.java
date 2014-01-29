public class FibMemoGenarator {
	private int [] precalculated = null;

	public int fib (int n) 
		if (precalculated == null) {
			precalculated = new int [n];
			for (int i = 0; i < precalculated.length; i++) {
				precalculated[i] = -1; // to indicate not calculated yet
			}
		}
		if ( (n == 1) || (n == 2) ) {
			return 1;
		} else {
			if (precalculated [n-1] != -1) {
				return precalculated[n-1];
			} else {
				int result = fib(n-1) + fib(n-2);
				precalculated[n-1] = result;
				return result;
			}
		}
}