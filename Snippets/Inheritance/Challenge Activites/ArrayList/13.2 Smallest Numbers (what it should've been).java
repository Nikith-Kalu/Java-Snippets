import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LabProgram {
   public static void main(String args[]){
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> array = new ArrayList<Integer>();
      while (scnr.hasNextInt()) {
         array.add(scnr.nextInt());
      }
      Collections.sort(array);
      System.out.println(array.get(0) + " and " + array.get(1));
    }
}
