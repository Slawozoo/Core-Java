package inheritance;

import java.util.Scanner;

public class SingleInheritance extends Student{
	public static void main(String[] args) {
		SingleInheritance std = new SingleInheritance();
		int id;
		String fname;
		String lname;
		int roll;
		long phone;
		String address;
		
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter id: ");
		id = sc.nextInt();
		System.out.print("\nEnter first name: ");
		fname = scn.nextLine();
		System.out.print("\nEnter last name: ");
		lname = scn.nextLine();
		System.out.print("\nEnter roll: ");
		roll = sc.nextInt();
		System.out.print("\nEnter phone no.: ");
		phone = sc.nextLong();
		System.out.print("\nEnter address: ");
		address = scn.nextLine();
		
		Student st = new Student(id, fname, lname, roll, phone, address);
		String result = st.toString();
		System.out.println(st.toString());
		
		
	}
}
