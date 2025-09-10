import java.util.Scanner;

public class RosiesRoadCo {
   public static void main(String[] args) {
      // Use the methods defined below to compose a solution to the given problem 
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter Road Project Length in Miles : ");
      double miles = scan.nextDouble();
      System.out.print("Enter Number of Lanes              : ");
      int lanes = scan.nextInt();
      System.out.print("Enter Depth of Asphalt in Inches   : ");
      int inches = scan.nextInt();
      System.out.print("Enter Days to Complete Project     : ");
      int days = scan.nextInt();

      // Calculating costs
      double costOfAsphalt = truckloadsOfAsphalt(miles, lanes, inches) * 1250;
      double costOfStoplights = numberOfStoplights(miles, lanes) * 32000; 
      double costOfWaterPipes = numberOfWaterPipes(miles) * 280;
      double costOfPowerPipes = numberOfPowerPipes(miles) * 350;
      double costOfLabor = numberOfCrewMembers(miles, lanes, days) * days * 8 * 24;
      double totalCost = costOfAsphalt + costOfStoplights + costOfWaterPipes + costOfPowerPipes + costOfLabor;

      System.out.println();
      System.out.println("== Amount of Materials Needed ===");
      System.out.println("Truckloads of Asphalt : " + truckloadsOfAsphalt(miles, lanes, inches));
      System.out.println("Stoplights            : " + numberOfStoplights(miles, lanes));
      System.out.println("Water pipes           : " + numberOfWaterPipes(miles));
      System.out.println("Power pipes           : " + numberOfPowerPipes(miles));
      System.out.println("Crew members needed   : " + numberOfCrewMembers(miles, lanes, days));

      System.out.println("=== Cost of Materials ============");
      System.out.printf("Cost of Asphalt       : $%.2f\n", costOfAsphalt);
      System.out.printf("Cost of Stoplights    : $%.2f\n", costOfStoplights);
      System.out.printf("Cost of Water Pipes   : $%.2f\n", costOfWaterPipes);
      System.out.printf("Cost of Power Pipes   : $%.2f\n", costOfPowerPipes);
      System.out.printf("Cost of Labor         : $%.2f\n", costOfLabor);

      System.out.println("=== Total Cost of Project ========");
      System.out.printf("Total cost of project : $%.2f\n", totalCost);
   }
   
   public static int numberOfStoplights(double miles, int lanes) {
      // Use the values stored in the miles and lanes parameter variables
      // to calculate the total number of stoplights needed.
      int stoplightsPerIntersection = 2 + lanes;
      int numberOfIntersections = (int)miles;
      int totalStoplights = stoplightsPerIntersection * numberOfIntersections;
      
      // Then return (not print) that calculated value.
      return totalStoplights;
   }
   
   public static int truckloadsOfAsphalt(double miles, int lanes, int inches) {
      // write your requires method here below
      // First, convert miles of road to feet of road and store in `roadLength`
      double roadLength = miles * 5280;
      // Second, compute width of road in feet, store in `roadWidth`
      int roadWidth = lanes * 12;
      // Third, compute depth of road in feet, store in `roadDepth`
      double roadDepth = inches / 12.0;
      // Fourth, compute total volume of asphalt in cubic feet (the `roadLength * roadWidth * roadDepth`), store in `asphaltCubicFeet`.
      double asphaltCubicFeet = roadLength * roadWidth * roadDepth;
      // Fifth, calculate weight of asphalt in pounds, tore in `asphaltPounds`
      double asphaltPounds = asphaltCubicFeet * 150;
      // Sixth, approximate number of truckloads, store in `approximateTruckLoads`
      double approximateTruckLoads = asphaltPounds / 10000;
      // seventh, round up approximateTruckLoads, store in 'totalTruckloads'
      int totalTruckloads = (int)Math.ceil(approximateTruckLoads);
      // Finally, return the value stored in `totalTruckloads`.
      return totalTruckloads;
   }
   
   public static int numberOfPowerPipes(double miles) {
      // First, convert miles of road to feet
      double feet = miles * 5280;

      // Second, approximate number of power pipes needed
      double approximatePowerPipes = feet / 20; // 20 ft per pipe

      // Third, round up the `approximatePowerPipes` to find the actual number of power pipes needed
      int totalPowerPipes = (int)Math.ceil(approximatePowerPipes);
      
      // Finally, return the value stored in `totalPowerPipes`
      return totalPowerPipes;
   }
   
   public static int numberOfWaterPipes(double miles) {
      // First, convert miles of road to feet
      double feet = miles * 5280;

      // Second, approximate the number of water pipes needed
      double approximateWaterPipes = feet / 15; // 15 ft per pipe

      // Third, round up the `approximateWaterPipes` to find the actual number of water pipes needed
      int totalWaterPipes = (int)Math.ceil(approximateWaterPipes);
      
      // Finally, return the value stored in `totalWaterPipes`.
      return totalWaterPipes;
   }
   
   public static int numberOfCrewMembers(double miles, int lanes, int days) {
      int crewMembers = (int)Math.ceil((50 * miles * lanes) / days);
      return crewMembers;
   }
}
