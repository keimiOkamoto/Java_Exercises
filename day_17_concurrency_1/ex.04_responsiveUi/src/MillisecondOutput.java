/**
* Day 17 (Concurrent programming) exercise 04 - 'Responcive UI'
*
* A small program that takes in 10 user inputs in milliseconds for the 
* desired time for a thread to sleep. The program will print when the 
* thread has been initialized and terminated according to the input time.
*/

import java.io.Console;

public class MillisecondOutput implements Runnable {
	private int id;
	private static int threadCount = 11;
	private final int thread_id = threadCount--;
	private static boolean runFirstIdentifier=true;
	private static boolean launchFirstIdentifier =true;
	private static Object obj = new Object();

	/**
	* constructer method
	* @param id of the thread
	*/
	public MillisecondOutput(int id) {
		this.id = id;
	}

	/**
	* Called from run to set thread to sleep. Then indicate when the thread has resumed 
	* and terminated.
	* @param milliseconds of the durstion the user desires the thread to sleep.
	*/
	private void launch(int milliSec) {
		try {
			Thread.sleep(milliSec);

			String print = (launchFirstIdentifier == true) ?  "Finished task " + this.id +":  " : "Finished task " + thread_id;
			System.out.println(print);
			launchFirstIdentifier = false;
		
		} catch (InterruptedException ex) {
			System.out.println("Thread interrupted!");
		}
	}

	/**
	* User enters number of milliseconds for thread to sleep. 
	* launch() is called from here.
	*/
	@Override
	public void run() {
		int milliSec  = 0;
		
		synchronized(obj) {
			String print = (runFirstIdentifier == true) ? "Enter the duration (in ms) of task "+ this.id +":  " : "Enter the duration (in ms) of task "+ (thread_id)+":  ";
			System.out.println(print);
			
			String input = System.console().readLine();
			milliSec = Integer.parseInt(input);	
			runFirstIdentifier = false;
		}
		launch(milliSec);
	}
}