package stringClass;

public class Example {

	public static void main(String[] args) {
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	    String str = "This is what you do";
		String helloString = new String(helloArray);  
	    System.out.println( helloString );
	    char ch = helloString.charAt(5);
	    System.out.println(ch);
	    
	    //compare
	    int result = helloString.compareTo(str);
	    System.out.println(result);
	    
	    //concat
	    //String str = "Hello";
	    System.out.println(str.concat(helloString));
	    
	    //toLowercase
	    System.out.println(str.toLowerCase());
	    
	    //toUppercase
	    System.out.println(helloString.toUpperCase());

	}

}
