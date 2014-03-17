/**
*Write a small program that asks for the names and IDs of all employees in a small company, and store them in an array of integers and an array of Strings. (You will need to *create a Java class to hold the arrays, and to access them).
*This is similar to the example from the notes, but you do not know the number of employees in advance. Read the names and IDs of employees until the user enters an 
*empty name (i.e. length 0) or an ID equal to 0.
*Once you have finished reading employee data, go through the employee list and print the names and IDs of those employees whose ID is even or their names start with “S”.
*(Hint: As you do not know how many employees you need in advance, you will need a growing array. Create a small array, if it gets full create an array twice as big, copy all *data to the new array, and discard the old array, etc).
*/

public class Company {
	private int[] ids;
	private String[] names;

	private int[] ids_new;
	private String[] names_new;

	private int[] master_id;
	private String master_names;

	private static int masterCounter = 0;

	
	public void setIArrayength(int x) {
		ids = new int [x];
		names = new String [x];
	}

	public void inputData() {
		int count = 0;
	
		while (count < ids.length) {
			System.out.println("Enter employee ID: ");
			String input = System.console().readLine();
			int id = Integer.parseInt(input);

			if (id != 0) {
				ids[count] = id;
				
				System.out.println("Enter employee name: ");
				input = System.console().readLine();
				if (input != "0" && input != null) {
					names[count] = input;
					
					count++;
				}
			} else {
				System.out.println("0 or null entered. Terminating");
				print(ids, names);
				System.exit(0);
			}
		} 
		transferArrays();
		growArrays();
		
	}

	public void transferArrays() {
		for (int x = 0; x < ids.length;x++) {
			ids_new = new int[ids.length];
			names_new = new String[names.length];

			ids_new[masterCounter] = ids[x] ;
			names_new[masterCounter] = names[x];
			masterCounter++;
		}
	}

	public void growArrays() {
		this.ids = new int [ids.length + ids.length]; 
		this.names = new String [names.length + names.length]; 
		inputData();
	}

	public void print(int[] ids, String[] names) {
		System.out.println("Printing ids :   ");
		for (int id : ids) {
			System.out.print(id + " ");
		}
		System.out.println("\nPrinting names :   ");
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
	}

	public static void main (String[] args) {
		Company aCompany = new Company();
		aCompany.setIArrayength(2);
		aCompany.inputData();
	}
}