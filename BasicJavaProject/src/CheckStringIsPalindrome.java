import java.util.Scanner;

public class CheckStringIsPalindrome {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = myObj.nextLine();
		StringBuilder sb=new StringBuilder(str);  
		    sb.reverse();  
		    String rev=sb.toString();  
		    if(str.equals(rev)){  
		    	System.out.println("The given String is palindrome");  
		    }
		    else{  
		    	System.out.println("The given String is not palindrome");  
		    }  
	}

}
