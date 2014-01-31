/**
* switch and enum practice
* Day 6 Anti-aircraftaim.
*/

import java.io.Console;

public class AntiAircraftAimGame {

	public static void main (String[]args) {
		System.out.println("Here they come! Try to bring the plane down!");
		Target aGame = new Target(3);
		aGame.play(aGame);
	}
}