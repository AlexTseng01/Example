/*
 * Class: CMSC201 
 * Instructor:
 * Description: (Give a brief description for each Program)
 * Due: 12/13/21
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Alex Tseng
*/

import org.junit.Test;

public class PrimeNumberMethodTest {
	@Test
	public void testOutput() {
		int number = 7;
		PrimeNumberMethod test = new PrimeNumberMethod();
		System.out.print("The number " + number + " ");
		if (test.isPrime(number))
			System.out.print("is a prime number");
		else
			System.out.print("is not a prime number");
	}
}