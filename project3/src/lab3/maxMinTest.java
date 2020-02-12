package lab3;

public class maxMinTest {
	
	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int x = Integer.MAX_VALUE + 1;
		System.out.println("Max Value plus 1 = "+ x); //-2147483648 goes back to min value
		
		System.out.println(Integer.MAX_VALUE + Integer.MIN_VALUE); // -1
		
		
		
	}

}
