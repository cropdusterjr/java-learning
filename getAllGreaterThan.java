public class getAllGreaterThan {
   public static void main(String[] args) {
      int[] myArray = {1, 22, 333, 400, 5005, 9};
      System.out.println(getAllGreaterThan(myArray, 200));
   }
   
   public static int[] getAllGreaterThan(int[] array, int threshold) {
      int count = 0;
      int j = 0;
      int i = 0;
      
      for (i = 0; i < array.length; ++i) {
         if (array[i] > threshold) {
            count++;
         }
      }

      int[] newArray = new int[count];

      for (i = 0; i < array.length; ++i) {
         if (array[i] > threshold) {
            newArray[j] = array[i];
            ++j;
         }
      }

      return newArray;
   }
   
}