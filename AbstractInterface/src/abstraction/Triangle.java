package abstraction;

public class Triangle extends Shape {
	double base;
	double height;

	public Triangle(String color, double base,
            double height)
	{
		super(color);
		System.out.println("Triangle constructor called");
		this.base = base;
		this.height = height;
	}

	@Override
	double area() {
		return (base*height)/2;
	}

	@Override
	public String toString() {
		return "Triangle color is " + super.getColor() + "and area is : " + area();
	}

}
