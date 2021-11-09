package oopfiletask;

public class Author {
	private String fName;
	private String lName;
	private String address;
	private String institution;
	private String email;
	private String name;
	
	public Author() {
		this.fName = " ";
		this.lName = " ";
		this.address = " ";
		this.institution = " ";
		this.email = " ";
		this.fName = " ";
	}
	
	
	public Author(String fName, String lName, String address, String institution, String email,String name) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.institution = institution;
		this.email = email;
		this.fName = name;
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


	public String getName() {
		return name;
	}


	public void setName(String fname, String lname) {
		this.name = fname.concat(lname);
	}


	@Override
	public String toString() {
		return "\nAuthor [\n\tName=" + name+ "\n\t Address=" + address + ", \n\tInstitution=" + institution + ", \n\tEmail=" + email + 
				"]";
	}


	
	
	
	
	
}
