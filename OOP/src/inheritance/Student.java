package inheritance;

public class Student {
	private int id;
	private String fname;
	private String lname;
	private int roll;
	private long phone;
	private String address;
	
	public Student() {
		id = 0;
		fname = " ";
		lname = " ";
		roll = 0;
		phone = 0;
		address = " ";
	}
	
	public Student(int id, String fname, String lname, int roll, long phone, String address) {
		//super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.roll = roll;
		this.phone = phone;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", roll=" + roll + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	
	
	
}
