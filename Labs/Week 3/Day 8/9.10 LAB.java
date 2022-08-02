import java.util.Scanner;

public class DescendingOrder {
   // TODO: Write a void method selectionSortDescendTrace() that takes 
   //       an integer array and the number of elements in the array as arguments, 
   //       and sorts the array into descending order.
   public static void selectionSortDescendTrace(int [] numbers, int numElements) {
      int i;
      int j;
      int indexLargest;
      int temp;
      int k;
      
      for(i = 0; i < numbers.length - 1; ++i){
         indexLargest = i;
         for(j = i + 1; j < numbers.length; ++j){
            indexLargest = j;
         }
      }
      
      temp = numbers[i];
      numbers[i] = numbers[indexLargest];
      numbers[indexLargest] = temp;
      
      for(k = 0; k < numElements; ++k){
         System.out.print(numbers[k] + " ");
      }
      System.out.println();
   }
   }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input, i = 0;
      int numElements = 0;
      int [] numbers = new int[10];

      // TODO: Read in a list of up to 10 positive integers; stop when
      //       -1 is read. Then call selectionSortDescendTrace() method.
      for(i = 0; i < 10; ++i){
         input = scnr.nextInt();
         
         if(input == -1){
            break;
         }
         else {
            numbers[i] = input;
         }
      }
      
      for(i = 0; i < 10; ++i){
         if(numbers[i] > 0 || numbers[i] < 0){
            ++numElements;
         }
      }
      
      int[] numbersArray = new int[numElements];
      
      for(i = 0; i < numElements; ++i){
         numbersArray[i] = numbers[i];
      }
      
      selectionSortDescendTrace(numbersArray, numElements);
 
 
   }
}