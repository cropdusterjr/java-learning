public class highwayInfo {
   public static void main(String[] args) {
      printHighwayInfo(90);
      printHighwayInfo(290);
      printHighwayInfo(185);
            
   }
   
   public static void printHighwayInfo(int highwayNum) {
      String output = "The " + highwayNum + " is ";

      // Determining if highway is primary or auxiliary
      if (highwayNum < 100) {
        output += "primary, ";
      }
      else {
        output += "auxiliary, serving the " + highwayNum % 100 + ", ";        
      }

      // Determining highway direction 
      if (highwayNum % 2 == 0) {
        output += "going east/west.";
      }
      else {
        output += "going north/south.";
      }

      System.out.println(output);
   }
   
}