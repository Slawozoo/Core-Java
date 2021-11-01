package task7;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void binarySearch1(int[] intArray,int key) {
		
		int result = Arrays.binarySearch(intArray,key);  
        //print the return result
        if (result < 0)  
            System.out.println("\nKey is not found in the array!");  
        else 
            System.out.println("\nKey is found at index: "+result + " in the array.");  
	}
	
	public static int[] arrayIntegerSort(int[] array) {
		// Arranging the order of array in descending order
		int[] arr = array;
		System.out.println("\nSorting Integer of array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		return arr;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter no. of array: ");
		n = sc.nextInt();
		System.out.println("Enter elements of array: ");
		int[] arr = new int[n];
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] intArray = arrayIntegerSort(arr);
		
		int li = 0;
		int hi = intArray.length-1;
		int mid = (li+hi)/2;
		
		
		System.out.println("Key to be search in the array: ");
		int key = sc.nextInt();
		
		//Binary search using conditions 
		while(li <= hi) {
			if(intArray[mid] == key) {
				System.out.println("Key is at "+mid+" postition.");
				break;
			}
			else if(intArray[mid] < key) {
				li = mid+1;
			}
			else {
				hi = mid-1;
			}
			mid = (li+hi)/2;
		}
		if(li > hi) {
		System.out.println("No element found1!!!!!!!!!");
		}
		
		//Next method for binary search using binarySearch() method from Arrays class
		binarySearch1(intArray, key);
		
	}

}
