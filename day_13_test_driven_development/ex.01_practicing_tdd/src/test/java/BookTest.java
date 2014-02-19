/**
* Day 13 (Test -Driven Development) exercise 01.1-01.11 - 'Practicing TDD'
*
* Exercise to practice TDD
*/
import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {
	private Book aBook;
	private String expected;
	private String expected1;

	@Before
	public void setup() {
		expected = "Hi ";
		expected1 = "Bye";
		aBook = new Book(expected, expected1);
	} 
	//author 
	@Test
	public void shouldBeAbleToGetAnAuthor() {
		String actual = aBook.getAuthor();

		assertEquals(expected, actual);

		Book aBook1 = new Book(expected1,"fly by");
		String actual1= aBook1.getAuthor();

		assertEquals(expected1, actual1);
	}
	//title
	@Test
	public void shouldBeAbleToGetATitle() {
		String actual = aBook.getTitle();

		assertEquals(expected1, actual);

		String expected2 = "The book of Ham";
		Book aBook2 = new Book("The book of Beef", expected2);
		String actual2 = aBook2.getTitle();
		
		assertEquals(expected2, actual2);
	}
}