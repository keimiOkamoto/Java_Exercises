/**
* Day 16 (Input and output) exercise 01 - 'ls'
*
* A small proram that shows the names in the current directory.
*/
package myPackage;

import java.io.*;

public class FileNamePrint {

	public static void main(String[] args) {
		File path = new File(".");
		String[] list; 

		list = path.list();

		for (String a : list) {
			System.out.println(a);
		}
	}
}