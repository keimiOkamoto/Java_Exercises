/**
* switch and enum practice
* Day 6 Anti-aircraftaim.
*/


import java.io.Console;

public class Target {
	private int [] [] [] aArray;
	private int size;
	private int randomNumX;
	private int randomNumY;
	private int randomNumZ;
	
	/**
	* Constructor that initializes the size of the the playing field and also initializes a 3D array.
	*@param size
	*/
	public Target(int size) {
		aArray = new int [size][size][size];
		this.init(aArray);
	}
	/**
	* 3D array initailization.
	*@param 3D aArray 
	*/
	public void init(int [][][] aAarray) {
		System.out.println("hi");
		for (int x = 0; x < aArray.length; x++) {
			aArray [x][x][x] = 0;
		}
		randomNumX = (int) Math.abs(aArray.length * Math.random());
		randomNumY = (int) Math.abs(aArray.length * Math.random());
		randomNumZ = (int) Math.abs(aArray.length * Math.random());

		System.out.println("Random numbers are:" + randomNumX + " " + randomNumY + " " + randomNumZ);
		aArray [randomNumX] [randomNumY] [randomNumZ] = 1;
	}

	
	public Result fire(int x, int y, int z) {
		if (aArray [x][y][z] == 1) {
			return Result.HIT;
		} 
		if (x > size || y > size || z > size ) {
			return Result.OUT_OF_RANGE;
		}
		
		if (x != randomNumX) {
			if (size/2 > x && size/2 < z) {
				return Result.FAIL_LEFT;
			} else if (size/2 < x && size/2 > z) {
				return Result.FAIL_RIGHT;
			}

			if (size/2 > x) {
				return Result.FAIL_RIGHT;
			} else {
				return Result.FAIL_LEFT;
			}
		} else if (y != randomNumY) {
			if (size/2 > y) {
				return Result.FAIL_HIGH;
			} else {
				return Result.FAIL_LOW;
			}
		} else if (z != randomNumZ) {
			if (size/2 > z) {
				return Result.FAIL_LONG;
			} else {
				return Result.FAIL_SHORT;
			}
		} 
		return null;
	}

	public void play(Target aGame) {
		Console input = System.console();
		boolean continueGame = true;
		boolean play = true;
		
		do {
			System.out.println("Enter a coordinate X.");
			int x = Integer.parseInt(input.readLine());

			System.out.println("Enter a coordinate Y.");
			int y = Integer.parseInt(input.readLine());

			System.out.println("Enter a coordinate Z.");
			int z = Integer.parseInt(input.readLine());
			/*
			if (x > aArray.length || y > aArray.length || z > aArray.length ) {
				System.out.println();
			}
			*/
			Result theResult = aGame.fire(x,y,z);
			
			switch(theResult) {
				case HIT :
					System.out.println("You hit it!  Well done!");
					play = false;
					continueGame = false;
					break;
				case FAIL_LEFT :
					System.out.println("You missed!  Target is to the left!");
					break;
				case FAIL_RIGHT :
					System.out.println("You missed!  Target is to the right!");
					break;
				case FAIL_HIGH :
					System.out.println("You missed!  Target is to the higher!");
					break;
				case FAIL_LOW :
					System.out.println("You missed!  Target is to the lower!");
					break;
				case FAIL_SHORT :
					System.out.println("You missed!  Target is to the nearer!");
					break;
				case FAIL_LONG :
					System.out.println("You missed!  Target is to the further!");
					break;
				case OUT_OF_RANGE :
					System.out.println("Out of range");
					break;
				default :
					System.out.println("ERROR");
			}

			do {
				System.out.println("Would you like to continue?");
				String answer = input.readLine();

				switch (answer) {
					case "Y" :
						play = true;
						continueGame = false;
						break;
					case "N" :
						System.out.println("Game Over. Thanks for playing!");
						play = false;
						continueGame = false;
						break;
					default :
						System.out.println("Invalid input.");
						break;
					} 
			}while(continueGame);
		} while(play);
	}
}