import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75. 
      double caf1;
      double caf2;
      double caf3;
      
      caffeineMg = scnr.nextDouble(); 
      caf1 = (caffeineMg / 2);
      caf2 = (caffeineMg / 4);
      caf3 = (caffeineMg / 16);
      
      System.out.printf("After 6 hours: %.2f mg\n", caf1);
      System.out.printf("After 12 hours: %.2f mg\n", caf2);
      System.out.printf("After 24 hours: %.2f mg\n", caf3);
   }
}

