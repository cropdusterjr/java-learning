import java.util.Scanner;

public class powerAndWater {
  public static void main(String[] args) {
    // Instantiating scanner
    Scanner scnr = new Scanner(System.in);

    // Declaring variables
    double milesOfRoad;
    int powerPipesNeeded;
    int waterPipesNeeded;
    double costOfPowerPipes;
    double costOfWaterPipes;
    double totalCost;

    // Collecting inputs
    System.out.print("Enter the number of miles of road : ");
    milesOfRoad = scnr.nextDouble();

    // Computing information
    powerPipesNeeded = (int) Math.ceil(milesOfRoad * 5280.0 / 12.0);
    waterPipesNeeded = (int) Math.ceil(milesOfRoad * 5280.0 / 24.0);
    costOfPowerPipes = (powerPipesNeeded * 220);
    costOfWaterPipes = (waterPipesNeeded * 415);
    totalCost = costOfPowerPipes + costOfWaterPipes;
    
    // Printing outputs
    System.out.printf("Number of power pipes needed : " + "%d\n", powerPipesNeeded);
    System.out.printf("Number of water pipes needed : " + "%d\n", waterPipesNeeded);
    System.out.printf("Cost of power pipes needed   : $" + "%.2f\n", costOfPowerPipes);
    System.out.printf("Cost of water pipes needed   : $" + "%.2f\n", costOfWaterPipes);
    System.out.printf("Total cost of pipes needed   : $" + "%.2f\n", totalCost);    
  }
}
