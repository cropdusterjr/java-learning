import java.util.Scanner;

public class Converter {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
      
      // Below this comment: declare any variables you may need
      double distance;
      double inches;
      int feet;
      double distanceInInches;
      
      // Below this comment: collect the required inputs
      System.out.print("Enter distance in meters : ");
      distance = scnr.nextDouble();
      
      // Below this comment: write Java code to do the computations needed to determine the correct output values
      distanceInInches = distance * 39.37;
      inches = distanceInInches % 12;
      feet = (int) distanceInInches / 12;

      // Below this comment: output the correct output values that you computed above
      System.out.printf("%.2f", distance);
      System.out.printf(" meters in Feet and Inches is : ");
      System.out.printf("%d\'", feet);
      System.out.printf(" %.2f\"\n", inches);
   }
}
