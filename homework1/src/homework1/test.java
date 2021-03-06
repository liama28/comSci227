package homework1;

public class test {

	public static void main(String[] args) {
		
		/*City c = new City("Paris", 75);
		// We should see the values with which we constructed it 
		System.out.println(c.getCityName()); // expected "Paris" 
		System.out.println(c.hostelCost()); // expected 75
		System.out.println(c.nightsStay(500)); // expected 6 
		System.out.println(c.nightsStay(50)); // expected 0
		System.out.println(c.postcardCost()); // expected 4
		System.out.println(c.numPostcards(50)); // expected 12
		*/
		
		// a few cities to visit
	    City paris = new City("Paris", 75);
	    City rome = new City("Rome", 50);
	    
	    // start out in Paris
	    Backpacker t = new Backpacker(500, paris);
	    // initial state 
	    
	    System.out.println(t.getCurrentCity()); // expected "Paris"
	    System.out.println(t.getJournal()); // expected "Paris(start)"
	    
	    // try going to Rome
	    t.visit(rome, 2); 
	    System.out.println(t.getCurrentCity()); // expected "Rome"
	    System.out.println(t.getJournal()); // expected "Paris(start),Rome(2)"
	    
	    // back to Paris for a week
	    t.visit(paris, 7);
	    System.out.println(t.getCurrentCity()); // expected "Paris" 
	    System.out.println(t.getJournal()); // "Paris(start),Rome(2),Paris(7)"

	    
	    
	    
	    t = new Backpacker(500, paris);  // start over
	    // initial state 
	    System.out.println(t.getCurrentMoney()); // expected 500
	    // visit a city
	    t.visit(rome, 2); 
	    System.out.println(t.getCurrentMoney()); // expected 400
	    t.visit(paris, 7); 
	    System.out.println(t.getCurrentMoney()); // expected 25 
	    System.out.println(t.getNightsInStation()); // expected 2
	    t.visit(paris, 7); 
	    System.out.println(t.getCurrentMoney()); // expected 25 
	    System.out.println(t.getNightsInStation()); // expected 9
	    t.sendPostcardsHome(1); 
	    System.out.println(t.getCurrentMoney()); // expected 21
	    t.sendPostcardsHome(12); 
	    System.out.println(t.getCurrentMoney()); // expected 1
	    System.out.println(t.isSOL()); // expected true
	    t.callHomeForMoney();
	    System.out.println(t.getCurrentMoney()); // expected 181
	    t.callHomeForMoney(); 
	    System.out.println(t.getCurrentMoney()); // still just 181

		

	}

}
