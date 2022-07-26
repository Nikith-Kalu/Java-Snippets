import java.util.Scanner;

// Output GCD of user-input numA and numB

public class GCDCalc {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numA;  // User input
      int numB;  // User input

      System.out.print("Enter first positive integer: ");
      numA = scnr.nextInt();

      System.out.print("Enter second positive integer: ");
      numB = scnr.nextInt();

      while (numA != numB) { // Euclid's algorithm
         if (numB > numA) {
            numB = numB - numA;
         }
         else {
            numA = numA - numB;
         }
      }

      System.out.println("GCD is: " + numA);
   }
}