import java.util.Scanner;

public class LabProgram {

   public static int getWordFrequency(String[] wordsList, int listSize, String currWord){
      int i;
      int frequency = 0;
      
      for (i = 0; i < listSize; ++i){
         if (currWord.equalsIgnoreCase(wordsList[i])){
         ++frequency;
      }
   }
   return frequency;
}
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i;
      int arraySizeInput = scnr.nextInt();
      
      String[] inputStringArray = new String[arraySizeInput];
      
      for (i = 0; i < arraySizeInput; ++i){
         inputStringArray[i] = scnr.next();
      }
      
      int[] arrayFreq = new int[arraySizeInput];
      
      for (i = 0; i < arraySizeInput; ++i){
         arrayFreq[i] = getWordFrequency(inputStringArray, arraySizeInput, inputStringArray[i]);
      }
      
      for (i = 0; i < arraySizeInput; ++i){
         System.out.println(inputStringArray[i] + " " + arrayFreq[i]);
   }
}
}