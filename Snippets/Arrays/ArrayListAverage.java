
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAverage {
   public static void main(String [] args) {
      final int NUM_ELEMENTS = 8;
      Scanner scnr = new Scanner(System.in);
      ArrayList<Double> userNums = new ArrayList<Double>(); // User numbers
      Double sumVal;
      Double averageVal; 
      int i; 
      
      // Get user numbers and add to userNums
      System.out.println("Enter " + NUM_ELEMENTS + " numbers...");
      for (i = 0; i < NUM_ELEMENTS; ++i) {
         System.out.print("Number " + (i + 1) + ": ");
         userNums.add(scnr.nextDouble());
      }
      
      // Determine average value
      sumVal = 0.0;
      for (i = 0; i < userNums.size(); ++i) {
         sumVal = sumVal + userNums.get(i); // Calculate sum of all numbers
      }
      averageVal = sumVal / userNums.size(); // Calculate average 
      
      System.out.println("Average: " + averageVal);
   }
}