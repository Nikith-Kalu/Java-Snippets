import java.util.Scanner;

public class LabProgram {
   
   public static void sortArray(int[] myArr){
      int n = myArr.length;
      for(int i = 0; i < n - 1; i++){
         for(int j = 0; j < n - i - 1; j++){
            if(myArr[j] > myArr[j + 1]){
               int temp = myArr[j];
               myArr[j] = myArr[j + 1];
               myArr[j + 1] = temp;
            }
         }
      }
   }
   public static void printArray(int myArr[]){
      int n = myArr.length;
      for(int i = 0; i < n; ++i){
         System.out.print(myArr[i] + ",");
      }
      System.out.println();
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrLength = scnr.nextInt();
      int [] myArr = new int[arrLength];
      
      for(int i = 0; i < arrLength; i++ ) {
         myArr[i] = scnr.nextInt();
      }
      sortArray(myArr);
      printArray(myArr);
   }
}
