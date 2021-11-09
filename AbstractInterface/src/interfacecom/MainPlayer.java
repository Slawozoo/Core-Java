package interfacecom;

public class MainPlayer {

	static public void main(String[] args) {
		SmartPhone smart = new SmartPhone();
		smart.next(); // Next from MusicPlayer

		// methods from musicplayer
		smart.start();
		smart.stop();
		smart.pause();

		// methods from radio
		smart.startRadio();
		smart.stopRadio();

		MusicPlayer.commercial("Apple"); // calls static method from musicplayer class

	}
}
