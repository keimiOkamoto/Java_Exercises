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

	/**
	* User enters a file name if it exists the program will
	* open and read the file.
	* @param args User inputs file name.
	*/
	public static void main (String[] args) {
		File file = new File("." + File.separator + "myPackage" + File.separator + args[0]);
		try {
			if (file.exists()) {
				BufferedReader in = new BufferedReader(new FileReader(file));
				String line ;
				while ((line = in.readLine()) != null) {
					System.out.println(line);
				}
			}  else {
				throw new FileNotFoundException();
			}
		} catch (FileNotFoundException ex) {
			System.out.println("ERROR: File does  not exist!");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
			
		
	}
}