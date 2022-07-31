import java.util.Scanner;

public class MileageCalc {
   public static double convKilometersToMiles(double numKm) {
      System.out.println("FIXME: Convert km to m");
      return 0.0;
   }
 
   public static double convLitersToGallons(double numLiters) {
      System.out.println("FIXME: Convert l to gal");
      return 0.0;
   }
 
   public static double calcMpg(double distMiles, double gasGallons) {
      System.out.println("FIXME: Calculate MPG");
      return 0.0;
   }
 
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double distKm;
      double distMiles;
      double gasLiters;
      double gasGal;
      double userMpg;
   
      System.out.print("Enter kilometers driven: ");
      distKm = scnr.nextDouble();
      System.out.print("Enter liters of gas consumed: ");
      gasLiters = scnr.nextDouble();
   
      distMiles = convKilometersToMiles(distKm);
      gasGal = convLitersToGallons(gasLiters);
      userMpg = calcMpg(distMiles, gasGal);
   
      System.out.println("Miles driven: " + distMiles);
      System.out.println("Gallons of gas: " + gasGal);
      System.out.println("Mileage: " + userMpg + " mpg");
   }
}

public static double convKilometersToMiles(double numKm) {
   double milesPerKm = 0.621371;
   return numKm * milesPerKm;
}

public static double convLitersToGallons(double numLiters) {
   double gallonsPerLiter = 0.264172;
   return numLiters * gallonsPerLiter;
}