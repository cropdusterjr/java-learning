import java.util.Scanner;

public class caffeine { 
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in); 
      double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75.  
      
      System.out.print("Enter caffeine amount (in mg) : ");
      caffeineMg = scnr.nextDouble(); 
         
      // Declaring variables
      double caffeineHalfLife6Hours;
      double caffeineHalfLife12Hours;
      double caffeineHalfLife18Hours;
      
      // Calculating halflives
      caffeineHalfLife6Hours = caffeineMg / 2.0;
      caffeineHalfLife12Hours = caffeineHalfLife6Hours / 2.0;
      caffeineHalfLife18Hours = caffeineHalfLife12Hours / 2.0; 
      
      // Printing outputs
      System.out.printf("After 6 hours  : " + "%.2f mg\n", caffeineHalfLife6Hours);
      System.out.printf("After 12 hours : " + "%.2f mg\n", caffeineHalfLife12Hours);
      System.out.printf("After 18 hours : " + "%.2f mg\n", caffeineHalfLife18Hours);  
   }
}