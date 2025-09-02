import java.util.Scanner;

public class PizzaParty {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      // Below this comment: declare any variables you may need
      int pizzasPurchased;
      int slicesPerPizza;
      int totalPizzaSlices;
      int numberOfAdults;
      int numberOfChildren;
      final int slicesPerAdult = 2;
      final int slicesPerChild = 1;
      int numberSlicesForAdults;
      int numberSlicesForEachChild;
      int numberSlicesLeftOver;
      
      // Below this comment: collect the required inputs
      // be sure to declare any variables you will need to store each input
      System.out.print("Number of pizzas purchased : ");
      pizzasPurchased = scnr.nextInt();

      System.out.print("Number of slices per pizza : ");
      slicesPerPizza = scnr.nextInt();

      System.out.print("Number of adults           : ");
      numberOfAdults = scnr.nextInt();

      System.out.print("Number of children         : ");
      numberOfChildren = scnr.nextInt();
      
      // Below this comment: write Java code to do the computations needed to determine the correct output values
      // Be sure to break down complex computations into simpler computations,
      // and store the intermediate values in variables that you can use for further computations.
      totalPizzaSlices = pizzasPurchased * slicesPerPizza;
      numberSlicesForAdults = numberOfAdults * slicesPerAdult;
      numberSlicesForEachChild = (totalPizzaSlices - numberSlicesForAdults) / numberOfChildren;
      numberSlicesLeftOver = (totalPizzaSlices - numberSlicesForAdults) % numberOfChildren;

      System.out.println("Number of slices each child will get is : " + numberSlicesForEachChild);
      System.out.println("Number of slices left over is           : " + numberSlicesLeftOver);
      
      // Below this comment: output the correct output values that you computed above
      // make sure that your outputs are formatted exactly like the Expected Outputs in the Test Data examples
      
      
   }
}