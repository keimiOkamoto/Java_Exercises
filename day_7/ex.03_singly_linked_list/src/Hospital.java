/**
* A hospltal that has a hospital manager. 
*Day 7 practice-singly linked-list
*/
public class Hospital {
	public static void main (String[]args) {
		HospitalManager aHmanager = new HospitalManager(); 
		
		aHmanager.addPatientToList(new Patient("Adam" ,"high fever"));
		aHmanager.addPatientToList(new Patient("Brad" ,"Broken leg"));
		aHmanager.addPatientToList(new Patient("Carl" ,"Broken chin"));
		aHmanager.addPatientToList(new Patient("Dean" ,"Bad back"));
		aHmanager.addPatientToList(new Patient("Eric" ,"Huge knee"));
		aHmanager.addPatientToList(new Patient("Frank" ,"Massive Elbow"));
		aHmanager.printList();
		aHmanager.removePatientFromList("Brad");
		aHmanager.removePatientFromList("Adam");
		aHmanager.removePatientFromList("Adam");
		aHmanager.removePatientFromList("Dean");
		aHmanager.removePatientFromList("Eric");
		
		System.out.println("After remove...");
		aHmanager.printList();

	} 	
}