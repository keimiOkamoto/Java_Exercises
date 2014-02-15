/**
* A patient class for a singly linked list. To be used with the Hospital class.
*Day 7 practice-singly linked-list
*/
public class Patient {
	private Patient next = null;
	private String name;
	private String illness;

	/**
	* Constructor for the patient 
	* @param name
	* @param illness
	*/
	public Patient(String name, String illness) {
		this.name = name;
		this.illness = illness;
	} 

	/**
	* Adds a patient to the list
	*@param aPatient
	*/
	public void add(Patient aPatient) {
		if (next == null) {
			next = aPatient;
			HospitalManager.patientCount++;
		} else {
			next.add(aPatient);
		}
	}

	/**
	* Adds a patient to the list
	*@param name of patient being removed
	*/
	public void remove(String name) {
		if (!next.getName().equals(name)) {
			System.out.println("Name not found");
		} else if (next.getName().equals(name)) {
			next = next.next;
			HospitalManager.patientCount--;
		}else {
			next.remove(name);
		}
	}

	/**
	* Print method for the list
	*/
	public void print() {
		if (next == null) {
			System.out.println(this.getName());
		} else {
			System.out.println(this.getName());
			next.print();
		}
	}

	/**
	* Getter for patient
	* @return the next patient
	*/
	public Patient getNext() {
		return this.next;
	}

	/**
	* Getter for patient
	* @param a patient
	*/
	public void setNext(Patient aPatient) {
		this.next = aPatient;
	}

	/**
	* Getter for patient name
	* @return patient name
	*/
	public String getName() {
		return this.name;
	}

	/**
	* Getter for patient illness
	* @return patient illness
	*/
	public String getIllness() {
		return this.illness;
	}
}