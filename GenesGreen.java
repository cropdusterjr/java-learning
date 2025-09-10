import java.util.Scanner;

public class GenesGreen {
   public static void main(String[] args) {
      // Instantiating scanner
      Scanner scan = new Scanner(System.in);
      // Collecting user inputs
      System.out.print("Enter Course Length : ");
      double length = scan.nextDouble();

      System.out.print("Enter Course Width  : ");
      double width = scan.nextDouble();

      // Calling methods
      int areaOfRoughSod = (int)Math.ceil(areaOfRectangle(length, width) - areaOfPuttingGreen(width) - areaOfTee(width) - areaOfSandTrap(width));
      int areaOfSmoothSod = (int)Math.ceil(areaOfPuttingGreen(width) + areaOfTee(width));
      int tonsOfSand = (int)Math.ceil(weightOfSand(width));
      int numberOfBushes = (int)Math.ceil(numberOfBushes(width, length));

      // Printing outputs
      System.out.println("Total square yards of rough sod  : " + areaOfRoughSod);
      System.out.println("Total square yards of smooth sod : " + areaOfSmoothSod);
      System.out.println("Tons of sand                     : " + tonsOfSand);
      System.out.println("Number of bushes                 : " + numberOfBushes);
   }
    
   // Methods
   public static double areaOfRectangle(double width, double height) {
      double area = width * height;
      return area;
   }

   public static double areaOfCircle(double diameter) {
      final double PI_VAL  = 3.14159;
      double radius = diameter / 2;
      double area = PI_VAL * radius * radius;
      return area;
   }
   
   public static double areaOfPuttingGreen(double width) {
      double greenWidth = width * (2.0/3.0);
      double totalPuttingGreenArea = areaOfCircle(greenWidth);
      return totalPuttingGreenArea;
   }

   public static double areaOfTee(double width) {
      double teeWidth = width * (1.0/3.0);
      double totalTeeArea = areaOfCircle(teeWidth);
      return totalTeeArea;
   }

   public static double areaOfSandTrap(double width) {
      double trapWidth = width * (1.0/4.0);
      double totalSandTrapArea = areaOfCircle(trapWidth);
      return totalSandTrapArea;
   }

   public static int numberOfBushes(double width, double length) {
      int totalBushes = (int)Math.floor(perimeterOfRectangle(width, length)- 2.0);
      return totalBushes;
   }

   public static double perimeterOfRectangle(double width, double length) {
      double perimeter = (width * 2) + (length * 2);
      return perimeter;
   }

   // Additional methods
   public static double areaOfSandTrapInFeet(double width) {
      double trapWidthInFeet = width * 3 * (1.0/4.0);
      double totalSandTrapAreaInFeet = areaOfCircle(trapWidthInFeet);
      return totalSandTrapAreaInFeet;
   }

   public static double volumeOfSand(double width) {
      double sandVolumeInCubicFeet = areaOfSandTrapInFeet(width) * 2; // 3 feet = 1 yard
      return sandVolumeInCubicFeet;
   }

   public static double weightOfSand(double width) {
      double sandWeightInLbs = volumeOfSand(width) * 80;
      double sandWeightInTons = sandWeightInLbs / 2000;
      return sandWeightInTons;
   }
}
