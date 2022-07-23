import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      int num4;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();
      
      double prod = num1 * num2 * num3 * num4;
      double avg = (num1 + num2 + num3 + num4)/4.0;
      
      System.out.println((int)prod+" "+(int)avg); 
      
      prod = (double)num1 * num2 * num3 * num4;
      
      System.out.printf("%.3f",prod); //prints float
      System.out.print(" ");
      System.out.printf("%.3f\n",avg);
   }
}
