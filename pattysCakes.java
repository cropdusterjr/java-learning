import java.util.Scanner;

public class pattysCakes {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to Patty's Cakes!");
      System.out.println();
            
      int numCupcakes = 0;

      while (numCupcakes != 4 && numCupcakes != 6) {
         System.out.print("How many cupcakes would you like, 4 or 6? ");
         numCupcakes = scan.nextInt();
         if (numCupcakes != 4 && numCupcakes != 6) {
            System.out.println("Invalid selection, please try again.");
         }         
      }     
      System.out.println("Great! Let's start filling your " + numCupcakes + "-pack.");
      System.out.println();

      System.out.println("Cupcake Menu:");
      System.out.println("1. Vanilla Delight:  $2.50");
      System.out.println("2. Chocolate Dream:  $3.00");
      System.out.println("3. Strawberry Bliss: $2.75");
      System.out.println("4. Caramel Drizzle:  $3.50");
    
      double salesTotal = 0.0;
      String cupcakeList = "";

      for (int i = 1; i <= numCupcakes; ++i) {   
         int selection = 0;     
         while (selection < 1 || selection > 4) {
            System.out.print("Select cupcake #" + i + ": ");
            selection = scan.nextInt();             
            if (selection < 1 || selection > 4) {
                System.out.println("Invalid selection, please try again.");
            }                 
         }

         switch (selection) {
            case 1:
               salesTotal += 2.50;
               cupcakeList += "   - Vanilla Delight\n";
               break;
            case 2:
               salesTotal += 3.00;
               cupcakeList += "   - Chocolate Dream\n";
               break;
            case 3:
               salesTotal += 2.75;
               cupcakeList += "   - Strawberry Bliss\n";
               break;
            case 4:
               salesTotal += 3.50;
               cupcakeList += "   - Caramel Drizzle\n";
               break;

         }
      }
      
      double salesTax = salesTotal * 0.08;
      double finalTotal = salesTotal + salesTax;

      System.out.println();
      System.out.println("Here are the cupcakes in your pack:");
      System.out.println(cupcakeList);

      System.out.printf("Sales Total:      $%.2f\n", salesTotal);
      System.out.printf("8%% Sales Tax:     $%.2f\n", salesTax);      
      System.out.printf("Total:            $%.2f\n\n", finalTotal);     
      System.out.println("Thank you for ordering from Patty's Cakes!");
   }

  
   
}