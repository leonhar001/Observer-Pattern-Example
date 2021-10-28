package observer;

public class Girlfriend implements BirthdayPersonArrivalObserver {

	@Override
	public void hasArrived(BirthdayPersonArrivalEvent event) {
		
		System.out.println("Turnoff the lights...");
		System.out.println("Remain silent...");
		System.out.println("Surprise!");
	}
	
}
