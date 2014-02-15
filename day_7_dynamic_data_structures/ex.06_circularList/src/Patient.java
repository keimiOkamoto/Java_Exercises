public class Patient {
	private Patient next = null;
	private Patient firstNode = null;
	private String name;


	// constructor method
	public Patient (String name){
		this.name = name;
	}

	public void addNext(Patient p){
		if (this.next == null) {
			this.next = p;
			p.firstNode = this; //This needs to change to the point to the head
			this.firstNode = null;
			System.out.println(p.getName() + " just a little test");
		} else {
			this.next.addNext(p);	
		}
		
	}

	public void printList(){
		if (next == null) {
			System.out.println(this.getName());
		} else {
			System.out.println(this.getName());
			this.next.printList();
		}
	}

	public String toString(){
		return null;

	}

	public void setFirst() {

	}

	public String getName(){
		return name;
	}
}