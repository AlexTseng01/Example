public class StringMethods {
	String test = "Hello World";
	
	public void getLength() {
		System.out.println("length: " + test.length());
	}
	
	public void getCharAt() {
		System.out.println("char at " + 0 + " is " + test.charAt(0));
	}
	
	public void getSubstring() {
		System.out.println("substring of 0 to 3 is " + test.substring(0, 3));
	}
	
	public void getIndexOf() {
		System.out.println("index of \"H\" is " +  test.indexOf("H"));
	}
}