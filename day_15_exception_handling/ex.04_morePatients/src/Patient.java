/**
*  Day 15 (exception hanling) exercise 04 - 'More Patients'
* Patient class for HospitalRegister.java
* Every patient object will have a name and date of birth.
*/
import java.io.Console;

public class Patient {
	private String name;
	private int yearOfBirth;

	/**
	* constructor for Patient
	*@param name, yearOfBirth
	*@throws IllegalArgumentException if the user enters a year larger that 1884. (patient age excceds 130 years old).
	*/
	public Patient(String name, int yearOfBirth) throws IllegalArgumentException {
		this.name = name;

		if (yearOfBirth < 1884 || yearOfBirth < 0) {
			throw new IllegalArgumentException("The year of birth is invalid.");
		} else {
			this.yearOfBirth = yearOfBirth;
		}
	}

	/**
	* Getter for patient's name
	*/
	public String getName() {
		return this.name;
	}

	/**
	* Getter for patient's age
	*/
	public int getAge() {
		return 2014 - yearOfBirth;
	}
}