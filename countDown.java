public class countDown {
   public static void main(String[] args) {
      int number = 4;
      countDown(number);
   }
   
   public static void countDown(int number) {
      int i;
      for (i = number; i >= 1; --i) {
         System.out.print(i + ",");
      }
   }
   
}