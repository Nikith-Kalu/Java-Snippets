import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);  
      int numElements; 
      int i;
      
      numElements = scnr.nextInt();
      int arrayNumbers[] = new int[numElements];  
      for (i = 0; i < numElements; ++i) {
         arrayNumbers[i] = scnr.nextInt();
      }
      
      for (i = (numElements - 1); i >= 0; --i) {
         System.out.print(arrayNumbers[i] + ",");
      }
      System.out.println();
   }
}