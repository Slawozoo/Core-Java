package interfacecom;

public interface Vehicle {

	public String licensePlate = "";
	public static float maxVel = 0;

	public void start();

	public void stop();

	//A default method can contain its own implementation directly within the Interface!
	default void blowHorn() { 
		System.out.println("Blowing horn");
	}

}

