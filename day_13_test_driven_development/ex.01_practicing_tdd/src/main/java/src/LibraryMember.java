/**
* Day 13 (Test -Driven Development) exercise 01.1-01.11 - 'Practicing TDD'
*
* Exercise to practice TDD
*/
public class LibraryMember implements Member {

	private String name;
	private int id;

	/**
	*Takes in a name.
	*@param Member name 
	*/
	public LibraryMember(String name) {
		this.name = name;
	}

	/**
	* Returns the member name.
	*@return String
	*/
	public String getMemberName() {
		return name;
	}

	/**
	*Sets the id of the member.
	*@param Id number
	*/
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	*Gets the Id number
	*@return int
	*/
	public int getId() {
		return id;
	}
}