import java.util.Scanner;

public class LabProgram {
   
   public static void swapValues(int[] values) {
      int temp = values[0];
      values[0] = values[1];
      values[1] = temp;
      int temp2 = values[2];
      values[2] = values [3];
      values[3] = temp2;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] array = new int[4];
      
      for(int i = 0; i < 4; ++i){
         int input = scnr.nextInt();
         array[i] = input;
      }
      swapValues(array);
      System.out.print(array[0] + " ");
      System.out.print(array[1] + " ");
      System.out.print(array[2] + " ");
      System.out.print(array[3]);
      System.out.println();
   }
}
