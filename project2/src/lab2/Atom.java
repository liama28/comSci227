package lab2;

/**
 * Model of a atom.
 */
public class Atom {
	
	
	/**
	* Number of protons.
	*/
	private int protons;
	
	/**
	* Number of neutrons.
	*/
	private int neutrons;
	
	/**
	* Number of electrons.
	*/
	private int electrons;
	
	/**
	* Constructs an Atom with the given protons, neutrons and electrons.
	* @param givenProtons
	*   the number of protons.
	* @param givenNeutrons
	* 	the number of Neutrons.
	* @param givenElectrons
	* 	the number of electrons
	*/
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons) {
		protons = givenProtons;
		neutrons = givenNeutrons;
		electrons = givenElectrons;
		}
	
	
	/**
	* gets atomic mass.
	* @return
	*   returns total number of protons plus neutrons
	*/
	public int getAtomicMass() {
		return protons + neutrons;
		
	}
	
	/**
	* gets atomic charge.
	* @return
	*   returns the difference between the number of protons and electrons
	*/
	public int getAtomicCharge() {
		return protons - electrons;
		
	}
	
	/**
	* decreases the number of protons by 2 and the number of neutrons by 2
	*/
	public void decay() {
		protons -= 2;
		neutrons -= 2;
	}
	
}
