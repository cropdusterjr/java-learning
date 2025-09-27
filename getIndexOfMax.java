public class getIndexOfMax {
   public static void main(String[] args) {
      int[] array = {1, 22, 333, 400, 5005, 9};
      System.out.println(getIndexOfMax(array));
   }
   
   public static int getIndexOfMax(int[] array) {
      int i;
      int maxValue = 0;
      int maxIndex = 0;

      for (i = 0; i < array.length; ++i) {
         if (array[i] > maxValue) {
            maxValue = array[i];
            maxIndex = i;
         }
      }

      return maxIndex;
   }
   
}