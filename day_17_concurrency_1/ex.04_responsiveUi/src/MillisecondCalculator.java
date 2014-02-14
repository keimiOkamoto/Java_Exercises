import java.util.*;


public class MillisecondCalculator implements Runnable {
	public static int count = 10;

	public static void main(String args []) {
		for (int x = 10; x > 0; x-- ) {
			MillisecondCalculator aMilisecondCalculator = new MillisecondCalculator();
			Thread t = new Thread(aMilisecondCalculator);
			t.start();
		}
	}

	@Override
	public void run() {
		String x = System.console().readLine();
		int input = Integer.parseInt(x);
		count--;
		System.out.println("Enter the duration ( in ms ) of task "  + count + " : " + input);
		System.out.println("Finished task: " + count);
	}
}