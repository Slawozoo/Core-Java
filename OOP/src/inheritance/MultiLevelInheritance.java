package inheritance;

import java.util.Scanner;

public class MultiLevelInheritance extends Employee{
	public static void main(String[] args) {
		MultiLevelInheritance std = new MultiLevelInheritance();
		int id;
		String fname;
		String lname;
		int roll;
		long phone;
		String address;
		String depart;
		long salary;
		String title;
		
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
		System.out.print("\nEnter title of Employee:");
		title = scn.nextLine();
		System.out.print("\nEnter department of employee: ");
		depart = scn.nextLine();
		System.out.print("\nSalary of Employee: ");
		salary = scn.nextLong();
		
		String name = fname.concat(lname);
		
		
		
		//Student st = new Student(id, fname, lname, roll, phone, address);
		Employee employee = new Employee(id, fname, lname, roll, phone, address,title, salary, depart);
//		employee.setId(id);
//		employee.setAddress(address);
//		employee.setFname(fname);
//		employee.setLname(lname);
//		employee.setRoll(roll);
//		employee.setPhone(phone);
		
		System.out.println(employee);
		
		
		
		
		
		
//		String result = st.toString();
//		System.out.println(st.toString());
	}

}
 
//Multilevel Inheritance

//public	class Animal{  
//void eat(){
//	System.out.println("eating");
//	}  
//}  
//public class Dog extends Animal{  
//void eat(){
//	System.out.println("eating fruits");
//	}  
//}  
//public class BabyDog extends Dog{  
//void eat(){
//	System.out.println("drinking milk");
//	}  
//public static void main(String args[]){  
//Animal a1,a2,a3;  
//a1=new Animal();  
//a2=new Dog();  
//a3=new BabyDog();  
//a1.eat();  
//a2.eat();  
//a3.eat();  
//}  
//} 