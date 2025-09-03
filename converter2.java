import java.util.Scanner;

public class converter2 {
   public static void main(String[] args) {
      // Instantiate Scanner
      Scanner scnr = new Scanner(System.in);
      
      // Variables
      double inches;
      int feet;
      double meters;
      double totalInches;
      
      // User inputs feet and inch values
      System.out.print("Enter feet   : ");
      feet = scnr.nextInt();

      System.out.print("Enter inches : ");
      inches = scnr.nextDouble();
      
      // Calculate conversion to meters
      totalInches = (feet * 12) + inches;
      meters = totalInches / 39.37;  
      
      // Print formatted conversion
      System.out.printf("%d\'", feet);
      System.out.printf(" and ");
      System.out.printf("%.2f\"", inches);
      System.out.printf(" is " + "%.2f", meters);
      System.out.printf(" Meters.\n");
   }
}
