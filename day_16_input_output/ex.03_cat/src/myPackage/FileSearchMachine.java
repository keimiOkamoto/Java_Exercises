/**
* Day 16 (Input and output) exercise 03 - 'cat'
*
* a)
* A small proram that takes a user input from the command line. If 
* the file with the same name exists the program must show the 
* contents on the screen.  If it doesn's exist it must say "NO",
*/
package myPackage;

import java.io.*;

public class FileSearchMachine {

	public static void main (String[] args) {
		File path = new File("./myPackage/openMe.txt");

		if (path.exists()) {
			System.out.println("File found");
		} else {
			System.out.println("Not found");
		}
	}
}