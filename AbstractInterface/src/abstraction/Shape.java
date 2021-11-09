package abstraction;

abstract class Shape {
	String color;
	  
    // abstract methods
    abstract double area();
    public abstract String toString();
  
    // abstract class can have the constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }
  
    public String getColor() { 
    	return color; }
}

