import java.util.Scanner;

public class PizzaSlices {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      // Collect the first number from the user.
      System.out.print("Enter total number of slices of pizza : ");
      int totalSlices = scnr.nextInt();
      // Collect the second number from the user.
      System.out.print("Enter the number of people : ");
      int numberOfPeople = scnr.nextInt();
      
      // Below this comment: declare any variables you may need
      int slicesPerPerson;
      int slicesLeftOver; 
      
      // Below this comment: write a Java statement to compute the number of slices each person will get 
      // and store the result in a variable named slicesPerPerson.
      slicesPerPerson = totalSlices / numberOfPeople;
            
      // Below this comment: write a Java statement to compute the number of slices left over
      // and store the result in a variable named slicesLeftOver.
      slicesLeftOver = totalSlices % numberOfPeople;
            
      // Below this comment: write a Java statement to display the number of slices each person will get.
      System.out.println("Number of slices each person will get : " + slicesPerPerson);
      
      // Below this comment: write a Java statement to display the number of slices left over.
      System.out.println("Number of slices left over : " + slicesLeftOver);
   }
}
