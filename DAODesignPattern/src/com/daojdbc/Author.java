package com.daojdbc;

public class Author {
	private String fName;
	private String lName;
	private String address;
	private String institution;
	private String email;
	
	public Author() {
		this.fName = " ";
		this.lName = " ";
		this.address = " ";
		this.institution = " ";
		this.email = " ";
	}
	
	
	public Author(String fName, String lName, String address, String institution, String email) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.institution = institution;
		this.email = email;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getInstitution() {
		return institution;
	}


	public void setInstitution(String institution) {
		this.institution = institution;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Author [fName=" + fName + ", lName=" + lName + ", address=" + address + ", institution=" + institution
				+ ", email=" + email + "]";
	}
	
	
	
	
}
