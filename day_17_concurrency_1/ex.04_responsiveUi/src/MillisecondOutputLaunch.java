/**
* Day 17 (Concurrent programming) exercise 04 - 'Responcive UI'
*
* A small program that takes in 10 user inputs in milliseconds for the 
* desired time for a thread to sleep. The program will print when the 
* thread has been initialized and terminated according to the input time.
*/

public class MillisecondOutputLaunch {
	private static int id = 0;
	
	/**
	* main method to launch 10 threads usint MillisecondOutput.java
	*/
	public static void main (String[]args) {
		for (int x = 0; x <= 10; x++ ) {
			Thread aNewThread = new Thread(new MillisecondOutput(id));
			id++;
			aNewThread.start();
		}
	}
}