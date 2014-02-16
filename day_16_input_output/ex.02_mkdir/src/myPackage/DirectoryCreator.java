/**
* Day 16 (Input and output) exercise 02 - 'mkdir'
*
* A small proram that takes input from the user and creates a directory with that name.
*/
package myPackage;

import java.io.*;

public class DirectoryCreator {

	/**
	* main method that takes an argument at the command line.
	* the user enters a name and the directory will be made.
	*@param args arry for directories. 
	*/
	public static void main (String[] args) {
		for (int x = 0; x < args.length; x++ ) {
			File path = new File(args[x]);
			path.mkdirs();
			System.out.println("Making directory  you named \'" + path + "\'");
		}
	}
}