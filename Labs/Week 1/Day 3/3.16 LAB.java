import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double mileGallon;
      double dollarGallon;
      double gasCost20;
      double gasCost75;
      double gasCost500;
      
      mileGallon = scnr.nextDouble();
      dollarGallon = scnr.nextDouble();
      gasCost20 = (dollarGallon / mileGallon) * 20;
      gasCost75 = (dollarGallon / mileGallon) * 75;
      gasCost500 = (dollarGallon / mileGallon) * 500;
      
      System.out.printf("%.2f %.2f %.2f", gasCost20, gasCost75, gasCost500);
   }
}