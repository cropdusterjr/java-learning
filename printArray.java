// import any necessary packages here below

public class printArray {
   public static void main(String[] args) {
      int[] array = {1, 22, 333, 400, 5005, 9};
      printArray(array, " - ");
      
   }
   
   public static void printArray(int[] array, String string) {
      String printArray = "";
      int i;

      for (i = 0; i < array.length; ++i) {
         if (i < array.length - 1) {
            printArray += array[i] + string;
         }
         else {
            printArray += array[i];
         }

      }

      System.out.println(printArray);
   }
   
   
}