package discount.factorypattern;

public class Tuesday implements Discount{

	private double discount = 9.5;
	@Override
	public double getDiscount() {
		
		return discount;
	}

	@Override
	public void calculateTotal(int amount) {
		long totalAmount = (long) (amount - getDiscount()); 
		System.out.println("Discount for Tuesday "+getDiscount()+" and Total amount: "+totalAmount);
		
	}

}
