import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i;
      int Value;
      double largeNum;
      
      Value = scnr.nextInt();
      
      double[] userValues = new double[Value];
   
      for (i = 0; i < (Value); ++i) {
         userValues[i] = scnr.nextDouble();
      }
      
      largeNum = userValues[0];
      
      for (i = 0; i < (Value); ++i) {
         if (userValues[i] > largeNum) {
            largeNum = userValues[i];
         }
      }
      
      for (i = 0; i < (Value); ++i) {
         userValues[i] = userValues[i]/largeNum;
      }
      
      for (i = 0; i < (Value); ++i) {
         System.out.printf("%.2f", userValues[i]);
         System.out.print(" ");
      }
      
      System.out.println();
      
   }
}