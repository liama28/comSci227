package lab3;

public class sequence {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,0};
		
		int b = 1000000;
		
		System.out.println("The " + b + "th number in the sequence is " + a[b % 7]);
		
		
	}

}
