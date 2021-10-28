package polymorphism;

public class Test {
	public int add;
	public String name;
	
	public void add(int x, int y) {
		add = x+y;
		System.out.println("Sum from Base class: "+add);
	}
	public String name(String nam) {
		name = nam;
		System.out.println("String from Base class :"+name);
		return name;
	}
}
