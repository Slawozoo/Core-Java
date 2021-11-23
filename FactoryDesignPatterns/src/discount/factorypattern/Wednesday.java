package discount.factorypattern;

public class Wednesday implements Discount{

	private double discount = 10.5;
	@Override
	public double getDiscount() {
		
		return discount;
	}

	@Override
	public void calculateTotal(int amount) {
		long totalAmount = (long) (amount - getDiscount());
		System.out.println("Discount for Wednesday "+getDiscount()+" and Total amount: "+totalAmount);
	}

}
