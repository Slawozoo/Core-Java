package polymorphism;


public class OverloadingMethods {
	public String name() {
		return "Example Overloading Method";
	}
	public int number() {
		return 07;
	}
	public String name(String name) {
		System.out.println(name);
		return name;
	}
	public String name(String fname, String lname) {
		String str = fname.concat(lname);
		return str;
	}
	public void number(int a, int b) {
		int add = a + b;
		System.out.println("sum : " +add);
	}
	
	 
	public static void main(String[] args) {
		 
		OverloadingMethods om = new OverloadingMethods();
		String str = om.name();
		System.out.println(str);
		String name = om.name("Neharika");
		System.out.println(name);
		String laptop = om.name("Asus", "laptop");
		System.out.println(laptop);
		int num = om.number();
		System.out.println(num);
		om.number(777,999);
		System.out.println(om.number());

	}

}
