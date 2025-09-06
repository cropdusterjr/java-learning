import java.util.Scanner;

public class tempConversion_2 { 
   public static void main(String[] args) {
    // Instantiating scanner
    Scanner scnr = new Scanner(System.in);
      
    // Declaring variables
    double tempInKelvin;
    double tempInFahrenheit;
    double degreeDifferenceCToK = 273.15;
    double degreeDifferenceCToF = 32;
    double degreeRatio = (9.0/5.0);

    // Collecting user input
    System.out.print("Enter temperature in Kelvin : ");
    tempInKelvin = scnr.nextDouble();

    // Calculating
    tempInFahrenheit = (tempInKelvin - degreeDifferenceCToK) * degreeRatio + degreeDifferenceCToF;

    // Printing outputs
    System.out.printf("%.2f", tempInKelvin);
    System.out.print(" degrees Kelvin is ");
    System.out.printf("%.2f", tempInFahrenheit);
    System.out.println(" degrees Fahrenheit");          
   }
}