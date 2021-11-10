package com.staticfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

	String name;
    String address;
    static final String COUNTRYNAME;
    
    static
    {
        COUNTRYNAME = "Nepal";
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    void showData()
    {
        System.out.println("Name of Person : " + getName());
        System.out.println("Address of person : " + getAddress());
        System.out.println("Country of person : "+  COUNTRYNAME);
    }
    
    public static void main(String arg[])
    {
    	int n;
    	Scanner scn = new Scanner(System.in);
    	System.out.print("Enter the no. of person: ");
    	n = scn.nextInt();
    	//Person person =  new Person();
    	List<Person> listPerson = new ArrayList<Person>();
    	for(int i = 0; i< n;i++) {
    		Person person =  new Person();
    		System.out.print("Enter name of Person: ");
    		person.setName(scn.next());
    		System.out.print("Enter address of Person: ");
    		person.setAddress(scn.next());
    		
    		listPerson.add(person);
    		
    		//person.showData(person);
    	}

    	for(int i =0; i<n ;i++) {
    		listPerson.get(i).showData();
//    		
    	}
    }
	
}
