public class Book {

	private String author;
	private String title;

	/**
	* Constructor for a Book
	*/ 
	public Book (String author, String title) {
		this.author = author;
		this.title = title;
	}
	
	/**
	* Retruns the name of the Author
	*@return author
	*/
	public String getAuthor(){
		return author;
	}

	/**
	*Returns the Book Title
	*@return String 
	*/
	public String getTitle(){
		return title;
	}
}