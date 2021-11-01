package task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortAndSearchList {

	public static void sortInteger(List<Integer> intList, int n) {
		Scanner ac = new Scanner(System.in);
		System.out.print("\nEnter the no. in the list: ");
		for (int i = 0; i < n; i++) {
			intList.add(ac.nextInt());
		}

		// Sorting list using Stream.sorted
		List<Integer> sortedList = intList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Integer list: " + sortedList);
	}

	static void sortString(List<String> strList, int n) {
		Scanner ac = new Scanner(System.in);
		System.out.print("Enter the String in the list: ");
		for (int i = 0; i < n; i++) {
			strList.add(ac.next());
		}
		// Sorting list using sort() method from collections class
//		Collections.sort(strList);
//		System.out.println("Sorted String list: " + strList);
		
		
		String[] stringArray = new String[strList.size()];
        stringArray = strList.toArray(stringArray);
		
		for(int i=0; i < stringArray.length;i++) {
			for(int j = i+1; j< stringArray.length; j++) {
				if(stringArray[i].compareTo(stringArray[j]) >0) {
					String temp = stringArray[i];
					stringArray[i] = stringArray[j];
					stringArray[j] = temp;
				}
			}
		}
		for(int i=0; i< stringArray.length;i++) {
			System.out.println(stringArray[i]);
		}
	}

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		int n;
		System.out.print("Enter the no of element in the list: ");
		n = ac.nextInt();

		ArrayList<String> al = new ArrayList<String>(n);
		List<Integer> al1 = new ArrayList<Integer>(n);

		sortInteger(al1, n);
		sortString(al, n);
		
		//Searching using contains() from list class and returns bool value
		boolean result = al.contains("apple");
		System.out.println(result);
		
		//Searching using indexOf() which returns the index of the result
		int index = al1.indexOf(8);
		System.out.println(index);
		int index1 = al.indexOf("banana");
		System.out.println(index1);
	}

}
