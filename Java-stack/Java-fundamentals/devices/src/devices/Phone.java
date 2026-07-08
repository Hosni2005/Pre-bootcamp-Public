package devices;

public class Phone {
	 public Phone() {
	        super();
	    }

	    public void makeCall() {
	        battery -= 5;
	        System.out.println("You make a phone call.");
	        checkBattery();
	        status();
	    }

	    public void playGame() {

	        if (battery < 25) {
	            System.out.println("Battery too low to play a game.");
	            status();
	            return;
	        }

	        battery -= 20;
	        System.out.println("You play a game.");
	        checkBattery();
	        status();
	    }

	    public void charge() {
	        battery += 50;
	        System.out.println("You charge the phone.");
	        status();
	    }

	    private void checkBattery() {
	        if (battery < 10) {
	            System.out.println("Battery critical!");
	        }
	    }
}
