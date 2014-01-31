/**
*0,1,2,3,4,5,6, 7,  8,  9,
*0,1,1,2,3,5,8,13,15,17
* Fibonacci number calculator
* Day 5
*/
public class Fibonacci {
	public static int fibonacciCalculator(int num) {
		if (num == 0 || num == 1) {
			return num;
		} else {
			int result = fibonacciCalculator(num - 1) + fibonacciCalculator( num - 2);
			return result;
		}
	}

	public static void main (String[]args) {
		System.out.println(Fibonacci.fibonacciCalculator(13));
	}
}
