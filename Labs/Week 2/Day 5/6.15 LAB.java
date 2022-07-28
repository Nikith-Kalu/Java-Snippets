import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arraySize;
      int i;
      int threshold;
      
      arraySize = scnr.nextInt();
      
      int arrayStore[] = new int [arraySize];
      
      for (i=0; i < arraySize; ++i) {
         arrayStore[i] = scnr.nextInt();
      }
       
      threshold = scnr.nextInt();
      
      for (i=0; i<arraySize; ++i) {
         if (arrayStore[i] < threshold) {
            System.out.print(arrayStore[i] + ",");
         }
      }
      
      System.out.println();
      
   }
}