import org.junit.*;
import static org.junit.Assert.*;

public class HashUtilTest {
	@Test
	public void shortHashTest(){
		HashUtilities h = new HashUtilities();

			int input = 5;
			int output = h.shortHash(input);
			int expected = 4;
			assertEquals(output, expected);
	}
}

// echo $CLASSPATH
// clear
//echo $