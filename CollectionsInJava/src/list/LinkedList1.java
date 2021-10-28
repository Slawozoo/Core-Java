package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList1 {
	public static void main(String [] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the elements of linked list: ");
		n = sc.nextInt();
		
		List<String> linkedList = new LinkedList<String>();
		
		for(int i = 0; i < n ;i++){
            System.out.print("Add Element in "+i+"th linked List: ");
            String element=sc.next();
            linkedList.add(element);
        }
		System.out.println(linkedList);
		
		
		Iterator itr = linkedList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		linkedList.remove(2);
		
		System.out.println(linkedList);
		
		
		
	}
}
