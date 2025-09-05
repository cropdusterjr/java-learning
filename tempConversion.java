// import the Scanner from the Java standard library
import java.util.Scanner;

public class tempConversion { 
   public static void main(String[] args) {
    // Instatiating scanner
    Scanner scnr = new Scanner(System.in);
      
    // Declaring variables
    double tempInFahrenheit;
    double tempInKelvin;
    double degreeRatio = (5.0/9.0);
    double degreeDifferenceCToK = 273.15;
    double degreeDifferenceFToC = 32.0;

    // Below this comment: collect the requried inputs from the user
    System.out.print("Enter temperature in Fahrenheit : ");
    tempInFahrenheit = scnr.nextDouble();
   
    // Below this comment: compute and store the required output values
    tempInKelvin = (tempInFahrenheit - degreeDifferenceFToC) * degreeRatio + degreeDifferenceCToK;

    // Below this comment: disply the required results
    System.out.printf("%.2f", tempInFahrenheit);
    System.out.printf(" degrees Fahrenheit is ");
    System.out.printf("%.2f", tempInKelvin);
    System.out.println(" degrees Kelvin");
          
   }
}