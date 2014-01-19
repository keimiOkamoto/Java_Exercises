/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maps;

import java.util.Scanner;

public class Maps {
	public static void main(String[] args) {
        		
        		HashUtilities aMap = new HashUtilities();
       		System.out.println("Give me a string and i will calculate it's hash code.");
        		Scanner x = new Scanner(System.in);
        		String str = x.nextLine();
        		int hash = str.hashCode(); //Takes in a hashCode
        		int smallHash = HashUtilities.shortHash(hash);
        		System.out.println("0< " + smallHash + " < 1000");
        
    }
    
}
