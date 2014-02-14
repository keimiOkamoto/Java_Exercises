/**
* Day 15 (exception hanling) exercise 04 - 'More Patients'
* Write a class that asks for data (name and year of birth) about new patients in a hospital and keeps them in a list of Patient. 
* The constructor of Patient must throw an IllegalArgumentException if the age of the patient is negative or greater than 130.
*/
import java.util.*;

public class HospitalRegister {
	List<Patient> aListOfPatients = new ArrayList<>();

	/*
	* main method that launches the 
	**/
	public static void main (String[]args) {
		HospitalRegister aHospitalRegister = new HospitalRegister();
		aHospitalRegister.createPatient();
	}

	/**
	* User can input the name and year of birth of the patient and add it to the ArrayList.
	*/
	public void createPatient() {
		System.out.println("Would you like to add a patient? \npress  any key to continue and 'quit' to terminate program.");
		String decision = System.console().readLine();

		while ( !decision.equals("quit" )) {
			System.out.println("Please enter name and year of birth of patient. To end the adding process type 'quit'.");

			String name = System.console().readLine();
			String age = System.console().readLine();
			int yearOfBirth = Integer.parseInt(age);

			if (name.equals("quit") || age.equals("quit")) {
				System.exit(0);
			}
			aListOfPatients.add(new Patient(name, yearOfBirth));
		} 
			System.out.println("Terminating program");
	
	}
}