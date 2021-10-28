package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 {
	public static void main(String[] args) {
		
		int n;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no. of element: ");
		n = scn.nextInt();
		List<String> list = new ArrayList<String>(n);
		
		System.out.print("Enter strings in the list: ");
		for(int i=0; i < n; i++) {
		String str = scn.next();
		list.add(str);
		}
		
		// use this to iterate the value inside the arraylist.
//	    for (int i = 0; i < list.size(); i++) {
//	          System.out.println(list.get(i));
//	     }
		
		//printing the valus using iterator
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println(list);
		
	}
}
