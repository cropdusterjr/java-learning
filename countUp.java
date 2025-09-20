public class countUp {
   public static void main(String[] args) {
      int number = 4;
      countUp(number);
   }
   
   public static void countUp(int number) {
      int i;
      for (i = 1; i <= number; ++i) {
         System.out.print(i + ",");         
      }
   }
   
}