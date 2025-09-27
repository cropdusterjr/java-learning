public class countGreaterThan {
   public static void main(String[] args) {
      int[] array = {1, 22, 333, 400, 5005, 9};
      System.out.println(countGreaterThan(array, 200));
   }
   
   public static int countGreaterThan(int[] array, int threshold) {
      int count = 0;
      int i;
            
      for (i = 0; i < array.length; ++i) {
         if (array[i] > threshold) {
            ++count;
         }
      }

      return count;
   }
   
}