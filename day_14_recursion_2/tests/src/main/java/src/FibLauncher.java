public class FibLauncher {
	
	public static void main (String [] args) {
		int number = 8;
		System.out.println( "The number entered was " + number + ".      Fibonacci number is " + FibGenarator.fib(number));

		FibGenarator.printNumbers(6);

		FibMemoGenerator aFibMemo = new FibMemoGenerator(); 
		aFibMemo.fib(6);
	}

}