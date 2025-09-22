public class noSpaces {
   public static void main(String[] args) {
      System.out.println(removeSpaces("John Jacob Jingleheimer Schmidt"));
   }
   
   public static String removeSpaces(String string) {
      String noSpaces = "";
      for (int i = 0; i < string.length(); ++i) {
         if (string.charAt(i) != ' ') {
            noSpaces += string.charAt(i);
         }
      }
      return noSpaces;
   }
   
}