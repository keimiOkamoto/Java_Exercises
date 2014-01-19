/**
*Circular lists
*A circular list is a dynamic list in which there is a beginning but there is no end: the last element is pointing back to the first element. Circular lists can be singly- or *doubly-linked. In this exercise, you must create a singly-linked circular list using the “hospital and patients” example as a starting point.
*
*1. Create the circular list and add several elements to it (around 10 is fine).
*2. Traverse it forwards for one complete loop. While you go around the list, print out the content of each element.
*How do you know that you have reached the end of the list when you never find a null pointer?
*3. Delete a couple of elements from the list.
*4. Traverse it again printing out the content of each element.
*5. Add a new element to the list. Try to delete an element that is NOT in the list.
*6. Traverse it again printing out the content of each element.
*/

/** 
* This class is the hospital class that contains the patient nodes.
*/
public class Hospital {

	private Patient headNode = null;

	public void launch(){
		Patient firstPatient= new  Patient("head");
		headNode = firstPatient;
		System.out.println(headNode.getName());

		Patient patient1 = new Patient("Adam");
		headNode.addNext(patient1);
		Patient patient2 = new Patient("Barry");
		headNode.addNext(patient2);
		Patient patient3 = new Patient("Cath");
		headNode.addNext(patient3);
		Patient patient4 = new Patient("Debbie");
		headNode.addNext(patient4);
		headNode.printList();
	}
	
	public static void main (String[]args) {

		Hospital aHospital = new Hospital();
		aHospital.launch();

		

	}
}