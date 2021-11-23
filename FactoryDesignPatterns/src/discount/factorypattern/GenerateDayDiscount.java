package discount.factorypattern;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class GenerateDayDiscount {

	public static void main(String[] args) {
		DiscountFactory disFactory = new DiscountFactory();
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		
		int totalAmount = 5000;
		Discount disDay = disFactory.getDiscount(dayOfWeek.toString());
		disDay.calculateTotal(totalAmount);

	}

}
