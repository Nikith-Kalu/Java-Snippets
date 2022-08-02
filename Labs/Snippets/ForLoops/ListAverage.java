import java.util.Scanner;

public class ListAverage {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int currValue;
      int valuesSum;
      int numValues;
      int i;
      
      numValues = scnr.nextInt(); // Gets number of values in list
      
      valuesSum = 0;
      
      for (i = 0; i < numValues; ++i) {
         currValue = scnr.nextInt(); // Gets next value in list
         valuesSum += currValue;
      }
      
      System.out.println("Average: " + (valuesSum / numValues));
   }
}