package lab2;

public class AtomTest {
	
	public static void main(String[] args) {
		
		Atom uranium;
		
		uranium = new Atom(92, 146, 92);
		
		System.out.println("Atomic Mass: " + uranium.getAtomicMass());
		System.out.println("Atomic Charge: " + uranium.getAtomicCharge());
		System.out.println("Decaying...");
		uranium.decay();
		System.out.println("Atomic Mass: " + uranium.getAtomicMass());
		System.out.println("Atomic Charge: " + uranium.getAtomicCharge());
	}

}
