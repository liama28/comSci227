package homework1;

public class City {
	
	/**
	 * The percentage of the hostel cost that cost for a postcard
	 */
	public static final double POSTCARD_COST = 0.05;
	
	/**
	 * The city's name
	 */
	private String cityName;
	
	/*
	 * The cost for a hostel
	 */
	private int hostelCost;
	
	
	
	
	
	/*
	Constructs a new City with the given name and lodging cost per night.
	There are the following public methods:
	 */
	/**
	 * Constructs a city with a name and a price that cost to stay at a hostel
	 * @param givenCityName
	 * 	TZhe city's name
	 * @param givenHostelCost
	 * 		The cost for a hostel
	 */
	public City(String givenCityName, int givenHostelCost) {
		cityName = givenCityName;
		hostelCost = givenHostelCost;
		
	}

	
	/**
	 * Gets the city's name
	 * @return
	 * 	Returns the city's name
	 */
	public String getCityName() {
		return cityName;
	}
	
	
	/**
	 * Gets the cost to stay at a hostel for a night
	 * @return
	 * 	Returns the hostel cost
	 */
	public int hostelCost() {
		return hostelCost;
	}
	
	/**
	 * Gets the cost of a postcard rounded to the nearest integer
	 * @return
	 * 	Returns the cost for a postcard to the nearest integer
	 */
	public int postcardCost() {
		return Math.round((float)0.05 * hostelCost);
	}
		
		
	/**
	 * Gets the maximum number of nights that can be spent at the hostel with the given amount of money
	 * @param moneyAvailable
	 * 	Amount of money available to spend on a hostel 
	 * @return
	 * 	Returns the amount of days that can be spent at the hostel with the amount of money
	 */
	public int nightsStay(int moneyAvailable) {
		return moneyAvailable / hostelCost;
	}
	
	
	/**
	 * Gets the maximum amount of postcards that can be bought with the given money
	 * @param moneyAvailable
	 * 	The available funds
	 * @return
	 * 	Returns the amount of postcards that can be bought with the given money
	 */
	public int numPostcards(int moneyAvailable) {
		return moneyAvailable / postcardCost();
		
	}
		
	

}
