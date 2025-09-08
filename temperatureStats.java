import java.util.Scanner;

public class temperatureStats {
  public static void main(String[] args) {
    // Instantiating scanner 
    Scanner scnr = new Scanner(System.in);

    // Declaring variables
    double firstTemp;
    double secondTemp;
    double thirdTemp;
    double fourthTemp;
    double minBracket1;
    double minBracket2;
    double minTrue;
    double maxBracket1;
    double maxBracket2;
    double maxTrue;
    double average;
    double range;
    double skew;
    double midpoint;

    // Collecting user inputs
    System.out.print("Enter first Temperature  : ");
    firstTemp = scnr.nextDouble();

    System.out.print("Enter second Temperature : ");
    secondTemp = scnr.nextDouble();

    System.out.print("Enter third Temperature  : ");
    thirdTemp = scnr.nextDouble();

    System.out.print("Enter fourth Temperature : ");
    fourthTemp = scnr.nextDouble();

    // Calculating values
    average = (firstTemp + secondTemp + thirdTemp + fourthTemp) / 4;
    minBracket1 = Math.min(firstTemp, secondTemp);
    minBracket2 = Math.min(thirdTemp, fourthTemp);
    minTrue = Math.min(minBracket1, minBracket2);
    maxBracket1 = Math.max(firstTemp, secondTemp);
    maxBracket2 = Math.max(thirdTemp, fourthTemp);
    maxTrue = Math.max(maxBracket1, maxBracket2);
    range = maxTrue - minTrue;
    midpoint = range / 2;
    skew = ((average - (minTrue + midpoint)) / range) * 100;

    // Printing outputs
    System.out.println("Min     : " + minTrue);
    System.out.println("Max     : " + maxTrue);
    System.out.println("Average : " + average);
    System.out.printf("Skew    : %.1f", skew);
    System.out.println("%");
    System.out.println("Range   : " + range);
  }
}
