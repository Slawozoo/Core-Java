package polymorphism;

public class MethodOverriding extends Test{
	public void add(int x, int y) {
		add = x+y;
		System.out.println("Sum from Child class: "+add);
	}
	public String name(String nam) {
		name = nam;
		System.out.println("Name from child class:"+name);
		return name;
	}
	
	
	public static void main(String[] args) {
		MethodOverriding overRide = new MethodOverriding();
		Test test = new Test();
		
		//calls add() method of child class as we called the methods from child class object
		overRide.add(5,10);
		String str = overRide.name("Asus");
		
		//calls method of base class as we used base class object to access the methods
		test.add(15, 35);
		test.name("Base Class");
		
		
	}
}
