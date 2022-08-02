import java.util.Scanner;
public class LinearSearch {
   public static int linearSearch(int [] numbers, int key) {
      int i;
      
      for (i = 0; i < numbers.length; ++i) {
         if (numbers[i] == key) {
            return i;
         }
      }
      
      return -1; /* not found */
   }
   
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int [] numbers = {2, 4, 7, 10, 11, 32, 45, 87};
      int i;
      int key;
      int keyIndex;
      
      System.out.print("NUMBERS: ");
      for (i = 0; i < numbers.length; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();
      
      System.out.print("Enter a value: ");
      key = scnr.nextInt();
      
      keyIndex = linearSearch(numbers, key);
      
      if (keyIndex == -1) {
         System.out.println(key + " was not found.");
      } 
      else {
         System.out.println("Found " + key + " at index " + keyIndex + ".");
      }
   }
}