/**
* Spy class to practice static methods and fields
*/

public class Spy {
	private static int spyCount;
	
	/**
	* Constructor 
	*@param spy_id
	*/
	public Spy(int spy_id) {
		spyCount++;
		System.out.println("Spy ID is " + spy_id);
	}

	/**
	* @return Number of spies
	*/
	public static int getNumberOfSpies() {
		return spyCount;
	}

	/**
	* Remove spies
	*@param spy_id
	*/
	public static void die(int spy_id) {
		spyCount--;
	}
	
	/**
	* Adds multiple spies
	*@param id
	*@return Spy objects
	*/
	public static Spy makeSpy(int id) {
		return new Spy(id);
	}

	/**
	* Main method that adds spies and removes spies
	*/
	public static void main (String [] args) {
		for (int x = 1; x <= 10; x++) {
			makeSpy(x);
		}
		
		for (int y = 1; y <= 3 ; y++ ) {
			Spy.die(y);
		}
		System.out.println("Spy count is " + Spy.spyCount);
	}
}