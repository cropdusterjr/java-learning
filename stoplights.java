import java.util.Scanner;

public class stoplights {
   public static void main(String[] args) {
      // Instantiating scanner
      Scanner scnr = new Scanner(System.in);
        
      // Declaring variables
      double milesOfRoad;
      int numberOfLanes;
      int numberOfStoplights;
      double costOfStoplights;
      int numberOfIntersections;
      int stoplightsPerIntersection;
      int lanesPerIntersection;
                  
      // Collecting inputs from user
      System.out.print("Enter the number of miles of road     : ");
      milesOfRoad = scnr.nextDouble();

      System.out.print("Enter the number of lanes on the road : ");
      numberOfLanes = scnr.nextInt();

      // Calculating stoplights and intersections
      numberOfIntersections = (int) milesOfRoad;
      stoplightsPerIntersection = (int) (numberOfIntersections * 2.0);
      lanesPerIntersection = (int) (numberOfLanes * numberOfIntersections);
      numberOfStoplights = stoplightsPerIntersection + lanesPerIntersection;
      costOfStoplights = numberOfStoplights * 25000;

      // Printing outputs
      System.out.printf("Number of intersections : " + numberOfIntersections + "\n");
      System.out.printf("Number of stoplights    : " + numberOfStoplights + "\n");
      System.out.printf("Cost of stoplights      : " + "$%.2f\n", costOfStoplights);
   }
}