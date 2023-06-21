package controller;


/**
 * This is a controller class that manage the arithmetic operations.
 * 
 * @author emalianakasmuri
 *
 */

public class NumberCalculator {
	
	
	/**
	 * A method that will get the summation from two numbers
	 * @param number1
	 * @param number2
	 * @return
	 */
	public int getSum(int number1, int number2) {
		
		return number1 + number2;
		
	}
	
	/***
	 * This method multiplies two numbers
	 * @param number1
	 * @param number2
	 * @return
	 */
	public int getMultiplication(int number1, int number2) {
	
		return number1*number2;
		
	}
	
	/***
	 * @author yungh
	 * This method calculate the summation of three numbers
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public int getThreeSum(int num1, int num2, int num3) {
		
		return num1+num2+num3;
	}
	
	/***
	 * @author yungh
	 * This method calculate the multiplication of three numbers
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public int getThreeMultiplication(int num1, int num2, int num3) {

		return num1*num2*num3;
	}

}
