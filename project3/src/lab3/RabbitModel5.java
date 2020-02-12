package lab3;
import java.util.Random;


/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel5
{
  // TODO - add instance variables as needed
  private int population;
  private int year;
  private Random a = new Random(12435);
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel5()
  {
	  population = 0;
	  year = 0;
  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {
    return population;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
	  year++;
	  population += a.nextInt(11);
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
	  population = 0;
  }
}