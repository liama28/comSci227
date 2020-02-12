package Feb3rd;

public class ParkingMeter {
	
	private int timeLeft;
	private int coinsCollected;
	private int maxTime;
	private int minutePerCoin;
	
	public ParkingMeter(int rate, int max) {
		timeLeft = 0;
		coinsCollected = 0;
		maxTime = max;
		minutePerCoin = rate;
		
	}

	public void addCoin() {
		if (timeLeft < maxTime) {
			coinsCollected++;
			timeLeft += minutePerCoin;
		}
	}
	
	public void undo() {
		if (timeLeft >= minutePerCoin) {
			coinsCollected--;
			timeLeft -= minutePerCoin;
		}
		
		
	}
	
}
