public class arrayContains {
   public static void main(String[] args) {
      int[] myArray = {22, 5005, 400, 333, 1, 9};
      System.out.println(contains(myArray, 400));
   }
   
   public static boolean contains(int[] array, int target) {
      boolean targetExists = false;
      int i;
      
      for (i = 0; i < array.length; ++i) {
         if (array[i] == target) {
            targetExists = true;
         }         
      }

      return targetExists;
   }
   
}