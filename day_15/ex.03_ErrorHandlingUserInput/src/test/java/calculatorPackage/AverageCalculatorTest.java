package src.test.java.calculatorPackage;

import src.main.java.calculatorPackage.*; 
import org.junit.*;
import static org.junit.Assert.*;


public class AverageCalculatorTest {
	
	@Test 
	public void shouldBeAbleToInputTenNumbers() {
		Calculator aCalculator = new CalculatorImpl();
		int[] actual = aCalculator.inputNumbers();
		int[] expected = {1,2,3,4,5,6,7,8,9,0};

		assertEquals(actual, expected);

	}

	public void shouldBeAbleToGetAverage(){

	}

}