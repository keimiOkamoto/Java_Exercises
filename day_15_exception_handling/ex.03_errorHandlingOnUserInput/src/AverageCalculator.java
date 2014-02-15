/**
* Day 15 (exception hanling) exercise 03 - 'Error handling on user input'
* part A and B
* class contains two methods for part A and B of the exercise.
*/

import java.io.Console;

public class AverageCalculator {
	/* 
	*default constructor
	**/
	public AverageCalculator() {
	}

	/**
	* gets the mean of ten numbers
	* @param input taken from numberOfInputDeclaration method
	* @throws NumberFormatException if the user enters a non-integer
	*/
	private void getAverageOfTenNumbers(int numOfInputs) {
		int average = 0;
		int result = 0;
		int number = numOfInputs;

		do {
			System.out.println("Enter " + number+ " numbers and I'll find the average for you!");
			try {
				String input = System.console().readLine();
				average = Integer.parseInt(input);
				result += average;
				numOfInputs--;

			} catch (NumberFormatException ex) {
				System.out.println("You didn't enter an integer number!");
			}
		} while (numOfInputs != 0);

		System.out.print(result / number);
		System.out.println(" is the mean average of your inputs!");
	}

	/**
	* @throws NumberFormatException if the user enters a non-integer
	*/
	public void numberOfInputDeclarationForMeanCounter() {
		int inputNum = 0;
			
			try {
				System.out.println("Enter the number of inputs you want to enter!");
				
				String input = System.console().readLine();
				inputNum = Integer.parseInt(input);
				getAverageOfTenNumbers(inputNum);
			
			} catch (NumberFormatException ex){
				System.out.println("You didn't enter an integer number! Try again.");
				
				numberOfInputDeclarationForMeanCounter();
			}
	}
}