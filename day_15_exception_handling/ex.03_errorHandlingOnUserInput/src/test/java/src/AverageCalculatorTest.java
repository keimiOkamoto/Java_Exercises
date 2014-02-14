import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class AverageCalculatorTest {
	/**
	* must beable to take in ten user inputs and calculate the average
	* excepting for non numbers 
	*exception for less than ten numbers
	*/
	@Test 
	public void shouldBeAbleToGetAverageOfTenNumbers() {
		AverageCalculator aAverageCalculator = new AverageCalculator();

		int actual = aAverageCalculator.getAverageOfTenNumbers();
		int expected = 40;
		
		assertEquals(expected, actual);
	}

	@Test
	public void shouldBeAbleToInputTenNumbers() throws Exception {

	}

	
}