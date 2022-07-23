import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      float num1;
      float num2;
      float num3;
      float num4;
      int intProduct;
      int intAverage;
      float fltProduct;
      float fltAverage;
      
      num1 = scnr.nextFloat();
      num2 = scnr.nextFloat();
      num3 = scnr.nextFloat();
      num4 = scnr.nextFloat();
      
      intProduct = (int) (num1 * num2 * num3 * num4);
      intAverage = (int) ((num1 + num2 + num3 + num4) / 4);
      fltProduct = (float) (num1 * num2 * num3 * num4);
      fltAverage = (float) ((num1 + num2 + num3 + num4) / 4);
      
      System.out.println(intProduct + " " + intAverage);
      System.out.printf("%.3f", fltProduct);
      System.out.print(" ");
      System.out.printf("%.3f", fltAverage);
   }
}
