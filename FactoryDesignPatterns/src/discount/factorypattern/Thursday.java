package discount.factorypattern;

public class Thursday implements Discount{
	private double discount = 8.5;
	@Override
	public double getDiscount() {
		
		return discount;
	}

	@Override
	public void calculateTotal(int amount) {
		long totalAmount = (long) (amount - getDiscount());
		System.out.println("Discount for Thursday "+getDiscount()+" and total amount: "+totalAmount);
		
	}

}
