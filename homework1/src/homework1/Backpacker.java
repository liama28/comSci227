package homework1;

public class Backpacker {
	
	/**
	 * The amount of money given to the backpacker for each postcard sent
	 */
	public static final int SYMPATHY_FACTOR = 30;
	
	/**
	 * Amount of money the backpacker has
	 */
	public int funds;
	
	/**
	 * The current city the backpacker is in
	 */
	private City location; 
	
	/**
	 * The list of city's and nights in city's 
	 */
	private String journal;
	
	/**
	 * Nights spent in current city
	 */
	private int nights;
	
	/**
	 * Number of post cards sent with out sympathy money redeemed on them
	 */
	private int postCardsSent;
	
	/**
	 * Nights spent at train station
	 */
	private int trainStation;
	
	
	
	
	/**
	 * Constructs a Backpacker with a starting amount of money and location
	 * @param initialFunds 
	 * 	Initial amount of money given to the backpacker
	 * @param initialCity 
	 * 	The city the backpacker starts in
	 * 		
	 */
	public Backpacker(int initialFunds, City initialCity) {
		funds = initialFunds;
		location = initialCity;
		journal = location.getCityName() + "(start)";
		nights = 0;
		
		
	}
	/**
	 * Get city name from current city
	 * @return
	 *  Returns the name of the Backpacker's current city.
	 */
	 public String getCurrentCity() {
		 return location.getCityName();
	 }
	 
	 /**
	  * Gets the amount of money the backpacker has
	  * @return
	  * 	Returns the amount of money the Backpacker currently has.
	  */
	 public int getCurrentMoney() {
		 return funds;
	 }
	 /**
	  * The Journal is list of all city's the backpacker has been in and the amount of days spent in that city
	  * @return
	  * 	Returns the Backpacker's journal
	  */
	 public String getJournal() {
		 return journal;
	 }
	 
	 /**
	  * Gets the amount of nights spent in the train station
	  * @return
	  * 	Returns the number of nights the Backpacker has spent in a train station when visiting a city without enough money for hostels.
	  */
	 public int getNightsInStation() {
		 return trainStation;
	 }

	 
	 /**
	  * Simulates a visit by the backpacker to the given city. The location, amount of nights, funds, and journal are updated.
	  * @param c
	  * 	The city the backpacker stays in
	  * @param numNights
	  * 	The number of nights spent in the city
	  */
	 public void visit(City c, int numNights) {
		 location = c;
		 nights = numNights;
		 trainStation += Math.max(nights - location.nightsStay(funds), 0);
		 funds -= (nights - Math.max(nights - location.nightsStay(funds), 0)) *  location.hostelCost();
		 journal += ", " + location.getCityName() + '(' + numNights + ')'; 
	 }

	 /**
	  * Buys postcards for a percent of the cost of a hostel in the city. subtracts from the funds.
	  * @param howMany
	  * 	The amount of postcards to buy
	  */
	 public void sendPostcardsHome(int howMany) {
		 howMany = Math.min(location.numPostcards(funds), howMany);
		 funds = (int) (funds - howMany * location.postcardCost());
		 postCardsSent += howMany;
	 }

	 /**
	  * Adds money to funds depending on the amount of post cards sent home and resets post cards back to 0
	  */
	 public void callHomeForMoney() {
		 funds += SYMPATHY_FACTOR * postCardsSent;
		 postCardsSent = 0;
	 }

	 /**
	  * Tells if the backpacker is Shit Out of Luck or not
	  * @return 
	  * 	Returns true if Backpacker doesn't have enough money to send postcard from the current city
	  */
	 public boolean isSOL() {
		 return funds < location.postcardCost();
	 }
	 

}
