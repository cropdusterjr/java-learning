public class countDivisibleBy {
   public static void main(String[] args) {
      System.out.println(countDivisibleBy(3, 5));
   }
   
   public static int countDivisibleBy(int num1, int num2) {
      int i = 1;
      int divisor1 = num1;
      int divisor2 = num2;      
      int divisibleNums = 0;

      while (i <= 100) {
         if (i % divisor1 == 0 || i % divisor2 == 0) {
            ++divisibleNums;
         }
         ++i;
      }

      return divisibleNums;
   }
   
}