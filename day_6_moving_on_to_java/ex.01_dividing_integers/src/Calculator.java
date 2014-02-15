public class Calculator {
	
	public int add(int x, int y) {
		return x + y;
	}

	public int subtract(int x, int y) {
		return x - y;
	}

	public int multiply(int x, int y) {
		return x * y;
	}

	public double divide(int x, int y) {
		double dx =(double)x;
		double dy =(double)y;
		double result = dx/dy;
		return result;
	}

	public int modulous(int x, int y) {
		return x % y;
	}
	
	public static void main(String[]args) {
		Calculator aCalculator = new Calculator();
		System.out.println(aCalculator.add(2,2));
		System.out.println(aCalculator.subtract(4,2));
		System.out.println(aCalculator.multiply(2,2));
		System.out.println(aCalculator.divide(5,2));
		System.out.println(aCalculator.modulous(5,2));
	
	}
}