public class getLast {
   public static void main(String[] args) {
      int[] myArray = {1, 22, 333, 400, 5005, 9};
      System.out.println(getLast(myArray));
   }
   
   public static int getLast(int[] array) {
      int last = 0;
      int i = array.length - 1; 

      while (i > array.length - 2) {
         last = array[i];
         --i;
      }
      
      return last;
   }
   
}