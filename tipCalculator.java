import java.util.Scanner;

public class tipCalculator {
   public static void main(String[] args) {
      // Instantiating scanner
      Scanner scnr = new Scanner(System.in);
        
      // Declaring variables
      double checkAmount;
      double tip10Percent;
      double tip15Percent;
      double tip20Percent;
      double tip25Percent;
      double tip30Percent;
      double totalPlus10PercentTip;
      double totalPlus15PercentTip;
      double totalPlus20PercentTip;
      double totalPlus25PercentTip;
      double totalPlus30PercentTip;

      // Collecting input from user
      System.out.print("Enter the check amount : ");
      checkAmount = scnr.nextDouble();

      // Calculating tips and totals
      tip10Percent = checkAmount * 0.10;
      totalPlus10PercentTip = checkAmount + tip10Percent;
      tip15Percent = checkAmount * 0.15;
      totalPlus15PercentTip = checkAmount + tip15Percent;
      tip20Percent = checkAmount * 0.20;
      totalPlus20PercentTip = checkAmount + tip20Percent;
      tip25Percent = checkAmount * 0.25;
      totalPlus25PercentTip = checkAmount + tip25Percent;
      tip30Percent = checkAmount * 0.30;
      totalPlus30PercentTip = checkAmount + tip30Percent;

      // Printing outputs
      System.out.printf("Total with 10%% tip " + "($%.2f) is ", tip10Percent);
      System.out.printf("$%.2f\n", totalPlus10PercentTip);
      System.out.printf("Total with 15%% tip " + "($%.2f) is ", tip15Percent);
      System.out.printf("$%.2f\n", totalPlus15PercentTip);
      System.out.printf("Total with 20%% tip " + "($%.2f) is ", tip20Percent);
      System.out.printf("$%.2f\n", totalPlus20PercentTip);
      System.out.printf("Total with 25%% tip " + "($%.2f) is ", tip25Percent);
      System.out.printf("$%.2f\n", totalPlus25PercentTip);
      System.out.printf("Total with 30%% tip " + "($%.2f) is ", tip30Percent);
      System.out.printf("$%.2f\n", totalPlus30PercentTip);
   }
}