package discount.factorypattern;

public class Friday implements Discount{

	private double discount = 8.5;
	@Override
	public double getDiscount() {
		
		return discount;
	}

	@Override
	public void calculateTotal(int amount) {
		long totalAmount = (long) (amount - getDiscount());
		System.out.println("Discount for Friday "+getDiscount()+" and total amount: "+totalAmount);
	}

}
