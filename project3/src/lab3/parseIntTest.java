package lab3;

public class parseIntTest {

	public static void main(String[] args) {
		
		String s = "27";
	    int x = Integer.parseInt(s);
	    System.out.println(x);
	    
	    //"Hello" or "23Skidoo"
	    String sh = "Hello";
	    String ss = "23skidoo";
	    
	    int y = Integer.parseInt(sh);
	    int z = Integer.parseInt(ss);
	    
	    System.out.println(y + "\n" + z);
	    
	    //Error: java.lang.NumberFormatException: For input string: "Hello"
		//at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
		//at java.lang.Integer.parseInt(Integer.java:580)
		//at java.lang.Integer.parseInt(Integer.java:615)
		//at lab3.parseIntTest.main(parseIntTest.java:15)

	    		
		
	}
	
	
}
