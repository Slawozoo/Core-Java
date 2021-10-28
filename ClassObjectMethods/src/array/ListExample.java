//Convert Array to list
package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListExample {

	public static void main(String[] args) {
		Scanner numScanner = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = numScanner.nextInt();
		Scanner stringScanner = new Scanner(System.in);
		//System.out.println("Enter elements of array : ");
		//String[] arr = {"Java","Python","RoR","NodeJs","React","DotNet"};
		String[] arr = new String[n];
		for(int i = 0; i < n ; i++) {
			System.out.println("Enter element : ");
			String str = stringScanner.nextLine();
			
			arr[i] = str;
		}
		System.out.println("Printing arrays :"+ Arrays.toString(arr));
		
		
		List <String> name = new ArrayList<String>();
		for(String lang:arr) {
			name.add(lang);
		}
		System.out.println("Array to list :"+name);

	}

}
