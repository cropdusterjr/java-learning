import java.util.*;
import java.io.*;

// Implementing Climate Zone Class
public class ClimateZone {
   // Declaring private variables
   private ArrayList<City> cityList;

   // Setting public Climate Zone methods
   public ClimateZone() {
      cityList = new ArrayList<City>();
   }

   public ClimateZone(String fileName) throws IOException {
      cityList = new ArrayList<City>();

      // Opening the file
      Scanner fileReader = new Scanner(new FileInputStream(fileName));
      
      // Taking input using while loop
      while (fileReader.hasNext()) {
         
         // Instantiating variables from file input
         String name = fileReader.next();
         String city = fileReader.next();
         double highTemp = fileReader.nextDouble();
         double lowTemp = fileReader.nextDouble();

         // Passing new City data to be added to array list
         this.addCity(name, city, highTemp, lowTemp);
      }
      
      // Closing input stream
      fileReader.close();
   }
   
   // Adding new City object to array list
   public void addCity(String name, String state, double highTemp, double lowTemp) {
      City newCity = new City(name, state, highTemp, lowTemp);
      cityList.add(newCity);
   }

   public int getCityCount() {
      int count = cityList.size();           
      return count;
   }

   public City getCityByName(String name, String state) {
      for (City currentCity : cityList) {
         if (currentCity.getName().equals(name) && currentCity.getState().equals(state)) {
            return currentCity;
         }
      }
      return null;
   }

   public void printHottestCities() {
      City firstHottestCity = null;
      City nextHottestCity = null;
      double highestTemp = -400.0;
      double nextHighTemp = -400.0;
      
      // Finding hottest city
      for (City currentCity : cityList) {
         if (currentCity.getHighTemp() > highestTemp) {
            firstHottestCity = currentCity;
            highestTemp = currentCity.getHighTemp();
         }
      }

      for (City currentCity : cityList) {
         if (currentCity.getHighTemp() > nextHighTemp && currentCity != firstHottestCity) {
            nextHottestCity = currentCity;
            nextHighTemp = currentCity.getHighTemp();
         }
      }

      firstHottestCity.printInfo();
      nextHottestCity.printInfo();
   }

   public void printColdestCities() {
      City firstColdestCity = null;
      City nextColdestCity = null;
      double coldestTemp = 400.0;
      double nextColdTemp = 400.0;

      for (City currentCity : cityList) {
         if (currentCity.getLowTemp() < coldestTemp) {
            firstColdestCity = currentCity;
            coldestTemp = currentCity.getLowTemp();
         }
      }

      for (City currentCity : cityList) {
         if ((currentCity.getLowTemp() < nextColdTemp) && (currentCity != firstColdestCity)) {
            nextColdestCity = currentCity;
            nextColdTemp = currentCity.getLowTemp();
         }
      }
      
      firstColdestCity.printInfo();
      nextColdestCity.printInfo();
   }

   public void printAllCities() {
      for (City currentCity : cityList) {
         currentCity.printInfo();
      }
   }
}