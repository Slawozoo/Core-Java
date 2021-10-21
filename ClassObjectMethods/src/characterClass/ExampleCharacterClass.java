package characterClass;

public class ExampleCharacterClass {

	public static void main(String[] args) {
		Character ch = new Character('s');	//ch is the object of the class Character
		char chara = 'T';
		char c = 'a';
		
		//CHecks if letter
		System.out.println("Checks if letter or not");
		System.out.println(ch.isLetter(c));
		
		//checks whitespace
		System.out.println("Checks if whitespace or not");
		System.out.println(ch.isWhitespace(c));
		System.out.println(ch.isWhitespace(' '));
	    System.out.println(ch.isWhitespace('\n'));
	    System.out.println(ch.isWhitespace('\t'));
	    
	    //checks uppercase
	    System.out.println("Checks if uppercase or not");
	    System.out.println(ch.isUpperCase(c));
	    System.out.println(ch.isUpperCase(chara));
	    
	    //checks lowercase
	    System.out.println("Checks if lowercase or not");
	    System.out.println(ch.isLowerCase(c));
	    System.out.println(ch.isLowerCase(' '));
	    System.out.println(ch.isLowerCase(chara));
	    
	    //toUpperCase
	    System.out.println("Convert lowercase to Uppercase:");
	    System.out.println(ch.toUpperCase(c));
	    System.out.println(ch.toUpperCase(' '));
	    System.out.println(ch.toUpperCase(chara));
	    
	    //toLowerCase
	    System.out.println("Convert uppercase to lowercase");
	    System.out.println(ch.toLowerCase(chara));
	    System.out.println(ch.toLowerCase(c));
	    System.out.println(ch.toLowerCase('\n'));
	    
	    //toString
	    System.out.println(ch.toString(c));
	    System.out.println(ch.toString(chara));
	    String str = ch.toString(c) + ch.toString(chara);
	    System.out.println(str);
	}

}
