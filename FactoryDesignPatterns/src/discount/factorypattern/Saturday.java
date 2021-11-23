package discount.factorypattern;

public class Saturday implements Discount{

	private double discount = 10;
	@Override
	public double getDiscount() {
		
		return discount;
	}

	@Override
	public void calculateTotal(int amount) {
		long totalAmount = (long) (amount - getDiscount());
		System.out.println("Discount for Saturday "+getDiscount()+" and total amount: "+totalAmount);
	}

}
