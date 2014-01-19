import org.junit.*;
import static org.junit.Assert.*;

public class LibraryMemberTest {
	
	@Test
	public void shouldBeAbleToGetAName(){
		String expected = "hi";
		LibraryMember aLibrayMember = new LibraryMember("hi");
		String actual = aLibrayMember.getMemberName();

		assertEquals(expected, actual);

		String expecter1 = "Yo";
		LibraryMember aLibrayMember1 = new LibraryMember("me");
		String actual1 = aLibrayMember1.getMemberName();

		assertEquals(expected1, actua1);
	}

}