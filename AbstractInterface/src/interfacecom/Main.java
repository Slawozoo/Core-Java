package interfacecom;

public class Main {
		// static method, can be called without instantiating the class
		public static void startEngine(Vehicle vehicle) {
			vehicle.start();
		}

	public static void main(String [] args) {
		Vehicle tesla = new Car();
		Vehicle tata = new Truck();
		
		tesla.blowHorn(); //blows horn from tesla

		Main.startEngine(tesla); // starting engine ...
		Main.startEngine(tata); // starting truck engine ...

	}

}
