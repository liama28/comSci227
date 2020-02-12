package postage1;

import java.util.Scanner;

public class PostageUtil
{
  /**
   * Returns the cost of postage for a letter of the given weight.
   * @param weight
   *   given weight in ounces
   * @return
   *   cost of postage for the weight
   */
  public static double computePostage(double weight)
  {
    if (weight <= 1) {
    		return 0.47;
    }
    else if (weight <= 3.5) {
    	return 0.47 + Math.ceil(weight-1) * 0.21;
    }
    else {
    	return 0.94 + Math.ceil(weight - 1) * .21;
    }
    
  }
  
  public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  
	  
	  System.out.print("Weight?: ");
	  System.out.println(PostageUtil.computePostage(s.nextDouble()));
	  
	  
	  
  }
}
