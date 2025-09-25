public class getFirst {
   public static void main(String[] args) {
      int[] myArray = {1, 22, 333, 400, 5005, 9};
      System.out.println(getFirst(myArray));
   }
   
   public static int getFirst(int[] array) {
      int firstValue = 0;
      int i = 0;

      while (i < 1) {
        firstValue = array[i];
        ++i;        
      }
      return firstValue;
   }
   
}