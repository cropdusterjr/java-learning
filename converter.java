import java.util.Scanner;

public class converter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); // instantiate Scanner

      // Variables
      double distance; 
      double inches;
      int feet;
      double distanceInInches;

      // User inputs distance in meters
      System.out.print("Enter distance in meters : ");
      distance = scnr.nextDouble();

      // Convert meters to standard lengths
      distanceInInches = distance * 39.37;
      inches = distanceInInches % 12;
      feet = (int) distanceInInches / 12;

      // Formatted print to console
      System.out.printf("%.2f", distance);
      System.out.printf(" meters in Feet and Inches is : ");
      System.out.printf("%d\'", feet);
      System.out.printf(" %.2f\"\n", inches);
   }
}
