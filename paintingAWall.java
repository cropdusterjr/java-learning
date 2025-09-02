import java.util.Scanner;

public class Paint {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      // collect your input(s)
      System.out.print("Enter wall height (feet) : ");
      int height = scnr.nextInt(); // height of wall

      System.out.print("Enter wall width (feet)  : ");
      int width = scnr.nextInt(); // width of wall

      // compute the required output(s)
      int area = height * width; // area of wall
      double gallons = (double)area / 350.0; // gallons of paint
      int cans = (int)Math.ceil(gallons);
            
      // display the output(s)
     System.out.printf("Wall area : %d square feet\n", area);
     System.out.printf("Paint needed : %.2f gallons\n", gallons);
     System.out.printf("Cans needed : %d can(s)\n", cans);
   }
}
