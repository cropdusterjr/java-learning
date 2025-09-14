public class greaterLesserEqual {
   public static void main(String[] args) {
      System.out.println(GLE(2, 1));
   }
   
   public static String GLE(int num1, int num2) {
      String output = "";
      
      if (num1 < num2) {
        output = "lesser";
      }
      else if (num1 > num2) {
         output = "greater";
      }
      else if (num1 == num2) {
        output = "equal";
      }

      return output;
   }
   
}