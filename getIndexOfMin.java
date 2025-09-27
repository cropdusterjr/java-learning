public class getIndexOfMin {
   public static void main(String[] args) {
      int[] array = {12, 13, 9, 400, 5005, 100};
      System.out.println(getIndexOfMin(array));
   }
   
   public static int getIndexOfMin(int[] array) {
      int i;
      int minValue = 1000000000;
      int minIndex = 0;

      for (i = 0; i < array.length; ++i) {         
         if (array[i] < minValue) {            
            minValue = array[i];
            minIndex = i;            
         }
      }

      return minIndex;
   }
   
}