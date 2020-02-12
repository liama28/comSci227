package lab3;


/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel
{
  // TODO - add instance variables as needed
  private int population;
  private int lastYearPop;
  private int yearBefore;
  private int year;
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel()
  {
	  year = 0;
	  population = 2;
	  lastYearPop = 1;
	  yearBefore = 0;
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
	  population = lastYearPop + yearBefore;
	  yearBefore = lastYearPop;
	  lastYearPop = population;
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
	  population = 2;
	  lastYearPop = 1;
	  yearBefore = 0;
  }
}