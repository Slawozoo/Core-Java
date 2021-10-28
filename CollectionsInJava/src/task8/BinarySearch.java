package task8;

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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = {2,5,7,8,9,10,15,16};
		int li = 0;
		int hi = array.length-1;
		int mid = (li+hi)/2;
		
		
		System.out.println("Key to be search in the array: ");
		int key = sc.nextInt();
		
		//Binary search using conditions 
		while(li <= hi) {
			if(array[mid] == key) {
				System.out.println("Key is at "+mid+" postition.");
				break;
			}
			else if(array[mid] < key) {
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
		binarySearch1(array, key);
		
	}

}
