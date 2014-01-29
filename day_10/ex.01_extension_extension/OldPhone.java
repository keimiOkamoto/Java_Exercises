/**
* A phone makes calls
*/

public interface Phone {
	/**
	* Just print on the screen "Calling number... "
	*/
	void call(Sting number);
}



	/**
	* Adds a patient to the list
	*@param aPatient
	*/
	public void addPatientToList(Patient aPatient) {
		if (this.next == null) {
			this.next = aPatient;
		} else {
			this.next.addPatientToList(aPatient);
		}
	}
	/**
	* Removes patiend from list, using the name as a reference 
	* @param name
	*/
	public void removePatientFromList(String name, Patient head) {
		if (this.next.getPatientName() == name ) {
			if (head.next.next == null) {
				head = this.next.next;
				this.next.next = null;
			} else {
			this.next = this.next.next;
			this.next.next = null;
			}
		} else {
			this.next.removePatientFromList(name, head);
		}
	}

	/**
	* Prints the content of the list
	*/
	public void printList() {
		if (this.next == null) {
			System.out.println(this.getPatientName());
		} else {
			System.out.println(this.getPatientName());
			this.next.printList();
		}
	}