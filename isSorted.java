public class isSorted {
   public static void main(String[] args) {
      int[] array = {1, 2, 3, 4, 5, 5};
      System.out.println(isSorted(array));
   }
   
   public static boolean isSorted(int[] arr) {
      boolean sortedAscending = true;
      int i;

      for (i = 0; i < arr.length-1; ++i) {
         if (arr[i] > arr[i + 1]) {
            sortedAscending = false;
            break;
         }
      }

      return sortedAscending;
   }
   
}