package discount.factorypattern;

public class DiscountFactory {
	public Discount getDiscount(String day) {
		if(day == null) {
			return null;
		}
		else if(day.equalsIgnoreCase("Sunday")) {
			return new Sunday();
		}
		else if(day.equalsIgnoreCase("Monday")) {
			return new Monday();
		}
		else if(day.equalsIgnoreCase("Tuesday")) {
			return new Tuesday();
		}
		else if(day.equalsIgnoreCase("Wednesday")) {
			return new Wednesday();
		}
		else if(day.equalsIgnoreCase("Thursday")) {
			return new Thursday();
		}
		else if(day.equalsIgnoreCase("Friday")) {
			return new Friday();			
		}
		else if(day.equalsIgnoreCase("Saturday")) {
			return new Saturday();
		}
		
		return null;
	}

}
