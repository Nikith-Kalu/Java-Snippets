import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      int num = scnr.nextInt();
      int i;
      int output1;
      String output;
      output = "";
      
       while (num > 0) {
          output = output + (num % 2);
          num = num/2;
          
       }
      System.out.println(output);
   }
}

