
public class ParseValueFromString {

	public static void main(String[] args) {
		// Parse value from a String to split
		String str = new String("Parse value from a string by splitting a string");
		String delims = " ";	//We can either use " " or "[ ]+" for splitting string using space
		//String delims = "[ ]+";	//
		String[] parse = str.split(delims);	
		for( String uniqueval : parse) {
			System.out.println(uniqueval);
		}
	}

}
