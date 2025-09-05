import java.util.Scanner;

public class asphalt {
   public static void main(String[] args) {
      // Instantiating scanner
      Scanner scnr = new Scanner(System.in);
      
      // Declaring variables
      double asphaltLengthInMiles;
      int numberOfLanes;
      int asphaltDepth;
      double asphaltLengthInFeet;
      double asphaltWidthInFeet;
      double asphaltDepthInFeet;
      final double asphaltWeightPerCubicFoot = 145;
      double asphaltVolume;
      double asphaltWeight;
      int truckLoads;
      double asphaltCost;
      final double tonsPerTruckLoad = 5;
                  
      // Collecting user inputs
      System.out.print("Enter length of road in miles    : ");
      asphaltLengthInMiles = scnr.nextDouble();

      System.out.print("Enter number of lanes            : ");
      numberOfLanes = scnr.nextInt();

      System.out.print("Enter depth of asphalt in inches : ");
      asphaltDepth = scnr.nextInt();
      
      // Calculating truckloads
      asphaltDepthInFeet = asphaltDepth / 12.0;
      asphaltWidthInFeet = numberOfLanes * 12;
      asphaltLengthInFeet = (int) (asphaltLengthInMiles * 5280);
      asphaltVolume = asphaltLengthInFeet * asphaltDepthInFeet * asphaltWidthInFeet;
      asphaltWeight = (asphaltWeightPerCubicFoot * asphaltVolume);
      truckLoads = (int) Math.ceil(asphaltWeight / 10000);

      // Calculating costs
      asphaltCost = Math.ceil(truckLoads * tonsPerTruckLoad) * 150.0; 
      
      // Printing outputs
      System.out.printf("Truckloads of asphalt needed is  : %d\n", truckLoads);
      System.out.printf("Total cost of asphalt is         : $%.2f\n", asphaltCost);
   }
}
