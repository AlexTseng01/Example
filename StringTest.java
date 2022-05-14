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

public class StringTest {
	@Test
	public void testOutput() {
		StringMethods test = new StringMethods();
		test.getLength();
		test.getCharAt();
		test.getSubstring();
		test.getIndexOf();
	}
}