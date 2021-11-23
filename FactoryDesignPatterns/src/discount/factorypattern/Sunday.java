package discount.factorypattern;

public class Sunday implements Discount{
	private double discount = 7.5;
	@Override
	public double getDiscount() {
		
		return discount;
	}

	@Override
	public void calculateTotal(int amount) {
		long totalAmount = (long) (amount - getDiscount());
		System.out.println("Discount for Sunday "+getDiscount()+" and total amount: "+totalAmount);
		
	}

}
