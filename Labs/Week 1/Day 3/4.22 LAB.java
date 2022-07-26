import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int x = scnr.nextInt();
      int y = scnr.nextInt();
      int z = scnr.nextInt();
      
      int[] anArray = {x, y, z};
      int sml = anArray[0];
      
      for (int i = 0; i < anArray.length; i++) {
         if(anArray[i] < sml) {
            sml = anArray[i];
         }
      }
      
      System.out.println(sml);
      
   }
}
