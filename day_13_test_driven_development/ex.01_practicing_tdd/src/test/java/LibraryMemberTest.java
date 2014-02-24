/**
* Day 13 (Test -Driven Development) exercise 01.1-01.11 - 'Practicing TDD'
*
* Exercise to practice TDD
*/
import org.junit.*;
import static org.junit.Assert.*;

public class LibraryMemberTest {
	private LibraryMember aLibrayMember;
	String expected;

	@Before
	public void setup() {
		expected = "John";
		aLibrayMember = new LibraryMember(expected);
	}

	@Test
	public void shouldBeAbleToGetAName() {
		String actual = aLibrayMember.getMemberName();

		assertEquals(expected, actual);

		String expected1 = "Gary";
		LibraryMember aLibrayMember1 = new LibraryMember("Gary");
		String actual1 = aLibrayMember1.getMemberName();

		assertEquals(expected1, actual1);
	}

	@Test
	public void shouldBeAbleToSetUniqueId() {
		int expected = 5;
		aLibrayMember.setId(5);
		int actual = aLibrayMember.getId();

		assertEquals(expected, actual);
	}


}