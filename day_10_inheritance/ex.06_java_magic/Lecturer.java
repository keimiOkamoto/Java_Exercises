/**
* A lecturer has both teaching and research responsibilities
*/
public class Lecturer extends Teacher {

	public Lecturer(String name) {
		super(name);
	}
	public void doResearch(String topic) { 
		System.out.println("Doing research on: " + topic);
	}
	//main method
	public static void main(String[]args) {
		Lecturer aLecturer = new Lecturer("Sergio");
		System.out.println("Lecturer's name is " + aLecturer.getName());
		aLecturer.teach("java");
		aLecturer.doResearch("Computer Science");
	} 
}