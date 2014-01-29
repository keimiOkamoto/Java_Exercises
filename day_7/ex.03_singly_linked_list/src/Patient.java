/**
* A patient class for a singly linked list. To be used with the Hospital class.
*Day 7 practice-singly linked-list
*/
public class Patient {
	private Patient next = null;
	private Patient temp = null;
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
		this.temp = this;
	} 

	/**
	* Adds a patient to the list
	*@param aPatient
	*/
	public void add(Patient aPatient) {
		if (next == null) {
			next = aPatient;
		} else {
			next.add(aPatient);
		}
	}

	/**
	* Adds a patient to the list
	*@param name of patient being removed
	*/
	public void remove(String name) {
		if (next.getPatientName().equals(name)) {
			temp = next;
			next = next.next;
			temp.next = null;
			temp = this;
		} else {
			next.remove(name);
		}
	}

	/*
	* Print method for the list
	*/
	public void print() {
		if (next == null) {
			System.out.println(this.getPatientName());
		} else {
			System.out.println(this.getPatientName());
			next.print();
		}
	}

	/**
	* Getter for patient name
	* @return the next patient
	*/
	public Patient getNext() {
		return this.next;
	}

	/**
	* Getter for patient name
	* @return patient name
	*/
	public String getPatientName() {
		return this.name;
	}

	/**
	* Getter for patient illness
	* @return patient illness
	*/
	public String getPatientIllness() {
		return this.illness;
	}
}