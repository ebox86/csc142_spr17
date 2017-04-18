/*
 * Homework 1 - calculates the functions e^x and sin(x) using Taylor Series approximation
 * 
 * Evan Kohout
 * 2017-04-12
 */

import java.lang.Math;

public class KohoutHW1 {

	/*
	 * Main method, outputs 2 separate blocks of text to console, one for e^x
	 * and the other for sin(x)
	 */
	public static void main(String[] args) {
		System.out.println("x\te^x");
		System.out.println("=\t===");
		// Prints returned values from eCalc method using inputs -3 to 3
		for (int i = -3; i < 4; i++) {
			System.out.println(Integer.toString(i) + "\t"
					+ Double.toString(eCalc(i)));
		}
		System.out.println("\nx\tsin(x)");
		System.out.println("=\t======");
		// Prints returned values from sinCalc method using inputs Pi/2, Pi, 3Pi/2 and 2Pi
		for (int i = 1; i <= 4; i++) {
			System.out.println(Integer.toString(i) + "PI/2" + "\t"
					+ Double.toString(sinCalc((i * Math.PI) / 2)));
		}
	}

	/*
	 * Calculates e^x when x is passed as an integer value.
	 * 
	 * @param xVar 		value used as the exponent for the calculation of e^x
	 * @return eToX 	returned calculation of e^x
	 */
	public static double eCalc(int xVar) {
		// Start of Taylor series calculation, adding 1 and x^1
		double eToX = 1 + xVar;
		double factorial = 1;
		// Taylor series calculation done by looping through 2 to 14, adding the total to factorial accumulator.
		for (int i = 2; i < 15; i++) {
			eToX += (Math.pow(xVar, i) / (factorial *= i));
		}
		return eToX;
	}

	/*
	 * Calculates sin(x) when x is passed as an integer value.
	 * 
	 * @param xVar		value used in the calculation of sin
	 * @return sinOfX	returned calculation of sin of input value x
	 */
	public static double sinCalc(double xVar) {
		double sinOfX = 0;
		double factorial = 1;
		// Used to alternate the sign
		int sign = 1;
		// Start of Taylor series calculation, starting with x^1/1! and adding only odd iterations to the accumulator, alternating sign
		for (int i = 1; i <= 29; i += 2) {
			factorial = 1;
			// Calculates factorial based on given odd value of i, up to and including i
			for (int j = 1; j <= i; j++) {
				factorial *= j;
			}
			// Calculates Taylor series element, changes sign as needed and adds product to sinOfX accumulator
			sinOfX += (Math.pow(xVar, i) / factorial) * sign;
			// Multiplies by negative one to change every other iteration of the Taylor series to be negative
			sign *= -1;
		}
		return sinOfX;
	}
}