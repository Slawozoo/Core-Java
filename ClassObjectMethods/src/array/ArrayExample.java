package array;

import java.util.Scanner;

public class ArrayExample {
	
	public int max(int[] ar) {
		int maxx=0;
		for(int i =0; i< ar.length ; i++) {
			if(ar[i] > maxx) {
				maxx = ar[i];
			}
		}
		
		return maxx;
	}
	public int min(int[] arr) {
		int min=0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	
	public static void main(String [] args) {
		ArrayExample arr = new ArrayExample();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = scn.nextInt();
		int[] myArray = new int[size];
		System.out.println("Enter the no. of array:");
		for(int i=0; i<size ; i++) {
			myArray[i] = scn.nextInt();
		}
		int max = arr.max(myArray);
		System.out.println("Max no. "+max);
		int min = arr.min(myArray);
		System.out.println("Min no." +min);
		
	}
}
