package task8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySortTask {
	public static int[] arrayIntegerSort(int[] array) {
		int[] arr = array;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer of Array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// System.out.println(array);
		System.out.println("Integers in the array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		// Arranging the order of array in descending order
		System.out.println("\nSorting Integer: ");
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

	public static String[] arrayStringSort(String[] array) {
		String[] str = array;
		Scanner sc = new Scanner(System.in);

		// String[] array = new String[n];
		System.out.print("Enter elements of Array: ");
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		// Sorting array using sort() method from Arrays class
		Arrays.sort(array);

		return str;
	}

	static void reverseArray(String a[], int n) {
		String[] b = new String[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}

		// printing the reversed array
		System.out.println("Reversed array is: \n");
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + "\t");
		}
	}

	static void reverseArray(Integer a[]) {
		// Reversing array using reverse() method from collections class
		Collections.reverse(Arrays.asList(a));
		System.out.println("\nReversed Integer: " + Arrays.asList(a));
	}

	static void searchArray(int[] intArray) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID to display: ");
		int search = sc.nextInt();
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == search) {

				System.out.println(intArray[i]);
			}
//            else {
//            	System.out.println("No match!!!!!");
//            }
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements to be entered in an array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		String[] array = new String[n];

		// Sorting
		int[] intArray = arrayIntegerSort(arr);

		String[] str = arrayStringSort(array);
		System.out.println("Sorting String: ");
		for (int i = 0; i < n; i++) {
			System.out.println(str[i]);
		}

		// Reversing
		reverseArray(str, n);

		Integer[] arrInteger = Arrays.stream(intArray).boxed().toArray(Integer[]::new);
		reverseArray(arrInteger);

		// Searching
		searchArray(intArray);

	}

}
