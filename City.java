// Implementing City Class
public class City {
   // Declaring private variables
   private String name;
   private String state;
   private double highTemp;
   private double lowTemp;

   // Setting public City methods
   public City(String name, String state, double highTemp, double lowTemp) {
      this.name = name;
      this.state = state;
      this.highTemp = highTemp;
      this.lowTemp = lowTemp;
   }

   public String getName() {
      return this.name;
   }

   public String getState() {
      return this.state;
   }

   public double getHighTemp() {
      return this.highTemp;
   }

   public double getLowTemp() {
      return this.lowTemp;
   }

   public void setHighTemp(double highTemp) {
      this.highTemp = highTemp;
   }

   public void setLowTemp(double lowTemp) {
      this.lowTemp = lowTemp;
   }

   public void printInfo() {
      System.out.printf("%s, %s (High = %.2f, Low = %.2f)\n", this.name, this.state, this.highTemp, this.lowTemp);
   }
}