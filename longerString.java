public class longerString {
   public static void main(String[] args) {
      System.out.println(longest("abc", "ab"));
   }
   
   public static String longest(String string1, String string2) {
      String output = "";

      if (string1.length() >= string2.length()) {
         output = string1;
      }
      else {
        output = string2;
      }

      return output;
   }
   
}