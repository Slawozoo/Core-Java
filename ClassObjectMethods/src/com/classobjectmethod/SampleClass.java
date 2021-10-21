package com.classobjectmethod;

public class SampleClass {
	private int age;
	private String name;
	private int roll;
	private String address;
	private long phone;
	
	//default constructer
	public SampleClass() {
		age = 0;
		name = " ";
		roll = 0;
		address = "";
		phone = 0;
	}
	
	//parameterized constucter
	public SampleClass(int age, String name, int roll, String address, long phone) {
		super();
		this.age = age;
		this.name = name;
		this.roll = roll;
		this.address = address;
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "SampleClass [age=" + age + ", name=" + name + ", roll=" + roll + ", address=" + address + ", phone="
				+ phone + "]";
	}

	public static void main(String[] args) {
		SampleClass sample = new SampleClass();
		SampleClass samples1 = new SampleClass(5, "Sadkishya",30, "Khaireni", 98410401 );
		String result = samples1.toString();
		System.out.println(result);
	}

}
