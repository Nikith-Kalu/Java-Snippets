import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      int num4;
      int intProduct;
      int intAverage;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();
      
      intProduct = (num1 * num2 * num3 * num4);
      intAverage = ((num1 + num2 + num3 + num4) / 4);
      
      System.out.println(intProduct + " " + intAverage);
   }
}
