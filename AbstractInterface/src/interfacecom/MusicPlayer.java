package interfacecom;

public interface MusicPlayer {
	public void start();

	public void pause();

	public void stop();

	default public void next() {
		System.out.println("Next from MusicPlayer");
	}
	public static void commercial(String sponsor) {	//Static method inside interface
	    System.out.println("Now for a message brought to you by " + sponsor);
	  }
}
