import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75. 
      
      caffeineMg = scnr.nextDouble(); 
      
      System.out.println("After " + 6 + " hours: " + (caffeineMg / 2) + " mg");
      System.out.println("After " + 12 + " hours: " + (caffeineMg / 4) + " mg");
      System.out.println("After " + 24 + " hours: " + (caffeineMg / 16) + " mg");
   }
}