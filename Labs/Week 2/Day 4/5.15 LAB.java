import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      int count = 0; 
      int max = 0;    
      float total = 0;
      
        int userInput = scnr.nextInt();
        while (userInput >= 0) {
            count++;
            total += userInput;
            max = Math.max(max, userInput);
            userInput = scnr.nextInt();
        }
        float avg = total / count; 
        System.out.print(max + " ");
        System.out.printf("%.2f\n", avg);
   }
}
