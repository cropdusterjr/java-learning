public class countDivisible3or5 {
   public static void main(String[] args) {
      System.out.println(countDivisible3or5(1, 20));
   }
   
   public static int countDivisible3or5(int num1, int num2) {
      int divisibleNums = 0;
      int larger = 0;
      int smaller = 0;
            
      if (num1 > num2) {
         larger = num1;
         smaller = num2;
      }
      else {
         larger = num2;
         smaller = num1;
      }
      int i;
      for (i = smaller; i <= larger; ++i) {
         if (i % 3 == 0 || i % 5 == 0) {
            ++divisibleNums;
         }         
      }
      
      return divisibleNums;
   }
   
}