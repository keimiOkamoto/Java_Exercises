import org.junit.*;
import static org.junit.Assert.*; 

public class PersonTest {

	@Test //This tells junit where to test from
	public void testsNormalName() {
		Person p = new Person();
		String input = "Keimi Okamoto";
		String actual = p.getInitials(input);
		String expected = " K";
		assertEquals(expected, actual);
	}
}