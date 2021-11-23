package discount.factorypattern;

public class Monday implements Discount{

	private double discount = 8.0;
	@Override
	public double getDiscount() {
		
		return discount;
	}

	@Override
	public void calculateTotal(int amount) {
		long totalAmount = (long) (amount - getDiscount());
		System.out.println("Discount for Monday "+getDiscount()+" and total amount: "+totalAmount);
	}
}
