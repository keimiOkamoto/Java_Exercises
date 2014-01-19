public class LibraryMember implements Member{

	private String name;

	/*
	*Takes in a name.
	*@param name 
	**/
	public LibraryMember(String name){
		this.name = name;
	}
	public String getMemberName(){
		return name;
	}	
}