import java.util.Scanner;

public class pizzaOrder {
   public static void main(String[] args) {
      // Instantiating scanner
      Scanner scnr = new Scanner(System.in);
     
      // Declaring variables
      int numberOfPeople = 0;
      int numberOfPizzas = 0;
      double numberOfSlices = 0;
      int slicesPerPerson = 0;
      int slicesPerPizza = 8;
                  
      // Collecting user inputs
      System.out.print("Enter total number of people : ");
      numberOfPeople = scnr.nextInt();

      System.out.print("Enter the number of slices each person will get : ");
      slicesPerPerson = scnr.nextInt();
         
      // Calculating pizza order
      numberOfSlices = slicesPerPerson * numberOfPeople;
      numberOfPizzas = (int) Math.ceil(numberOfSlices / 8);
            
      // Printing outputs
      System.out.println("Number of pizzas to order : " + numberOfPizzas);
   }
}
