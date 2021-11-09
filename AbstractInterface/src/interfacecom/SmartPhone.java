package interfacecom;

public class SmartPhone implements Radio, MusicPlayer{

	@Override
	public void start() {
		System.out.println("Start Music from Musicplayer");
		
	}

	@Override
	public void pause() {
		System.out.println("Pause music from musicplayer");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop mucis from musicplayer");
		
	}

	@Override
	public void startRadio() {
		System.out.println("Start radio");
		
	}

	@Override
	public void stopRadio() {
		System.out.println("Stop Radio");
	}
	
	public void next() {
        // Suppose you want to call MusicPlayer next
        MusicPlayer.super.next();
        
    }
}



