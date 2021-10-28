package inheritance;

public class Employee extends Student {
	//Student std = new Student(id, fname, lname, roll, phone, address);
	private String title;
	private String name;
	private long salary;
	private String depart;
	
	//private String name = super.getFname().concat(super.getLname());

	public Employee() {
		this.title = " " ;
		this.salary = 0;
		this.depart = " ";
		this.name = " ";
	}
	
	public Employee(String title, long salary, String depart, String name) {
		//super();
		this.title = title;
		this.salary = salary;
		this.depart = depart;
		this.name = name;
	}
	

	public Employee(int id, String fname, String lname, int roll, long phone, String address, 
			String title, long salary, String depart) {
		super(id, fname, lname, roll, phone, address);
		this.title = title;
		this.salary = salary;
		this.depart = depart;
		this.name = fname.concat(lname);
		
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		String name = super.getFname().concat(super.getLname());
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Student ID:"+ getId()+"Address: "+getAddress()+"Phone :"+super.getPhone()+"Roll : "+super.getRoll()+"Employee [title=" + title + ", name=" + name + ", salary=" + salary + ", depart=" + depart + "]";
	}
	
//	public String toString() {
//		return super.toString()+"Employee [title=" + title + ", name=" + name + ", salary=" + salary + ", depart=" + depart + "]";
//	}
	
	
	
	
	
	
}
