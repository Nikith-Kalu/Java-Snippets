import java.util.Scanner;
import java.util.Random;

public class LabProgram {
   
   public static String coinFlip(Random rand) {
      String coinFlipReturn = "";
      int randVal;
      
      randVal = rand.nextInt(2);
      
      if (randVal == 0){
         coinFlipReturn = "Tails";
      }
      else {
         coinFlipReturn = "Heads";
      }
      return coinFlipReturn;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Seed used in develop mode
      
      int input = scnr.nextInt();
      
      for (int i = 0; i < input; ++i){
         System.out.println(coinFlip(rand));
      }
   }
}