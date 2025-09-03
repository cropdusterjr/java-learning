import java.util.Scanner;

public class converter2 {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
      
      // Below this comment: declare any variables you may need
      double inches;
      int feet;
      double meters;
      double totalInches;
      
      // Below this comment: collect the required inputs
      System.out.print("Enter feet   : ");
      feet = scnr.nextInt();

      System.out.print("Enter inches : ");
      inches = scnr.nextDouble();
      
      // Below this comment: write Java code to do the computations needed to determine the correct output values
      totalInches = (feet * 12) + inches;
      meters = totalInches / 39.37;  
      
      // Below this comment: output the correct output values that you computed above
      System.out.printf("%d\'", feet);
      System.out.printf(" and ");
      System.out.printf("%.2f\"", inches);
      System.out.printf(" is " + "%.2f", meters);
      System.out.printf(" Meters.\n");
   }
}
