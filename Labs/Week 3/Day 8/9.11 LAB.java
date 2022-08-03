import java.util.Scanner;

public class LabProgram {
   
   public static void sortArray(int[] myArr, int arrSize){
      arrSize = myArr.length;
      for(int i = 0; i < arrSize - 1; i++){
         for(int j = 0; j < arrSize - i - 1; j++){
            if(myArr[j] > myArr[j + 1]){
               int temp = myArr[j];
               myArr[j] = myArr[j + 1];
               myArr[j + 1] = temp;
            }
         }
      }
   }
   public static void printArray(int myArr[]){
      int arrSize = myArr.length;
      for(int i = 0; i < arrSize; ++i){
         System.out.print(myArr[i] + ",");
      }
      System.out.println();
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrSize = scnr.nextInt();
      int [] myArr = new int[arrSize];
      
      for(int i = 0; i < arrSize; i++ ) {
         myArr[i] = scnr.nextInt();
      }
      sortArray(myArr, arrSize);
      printArray(myArr);
   }
}