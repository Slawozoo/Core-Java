package interfacecom;

public interface Radio {

	 public void startRadio();
     public void stopRadio();

    default public void next() {
        System.out.println("Next from Radio");
    }
}


