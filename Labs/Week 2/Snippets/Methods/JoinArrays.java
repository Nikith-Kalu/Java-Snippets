import java.util.Arrays;

public class JoinArrays {

   public static void main(String[] args) {
      double[] mondayTemperatures = {85.3, 95.8, 72.9}; // perfect sized array
      double[] tuesdayTemperatures = {68.3, 81.4, 74.8}; // perfect sized array

      // The toString() method in the Arrays class returns a String containing
      // the contents of the array, comma separated, in square brackets.
      // Alternatively, a for loop could be used to print the array contents.
      System.out.println("The temperatures on Monday were: " +    
         Arrays.toString(mondayTemperatures));
      System.out.println("The temperatures on Tuesday were: " + 
         Arrays.toString(tuesdayTemperatures));
              
      double[] earlyWeekTemperatures = joinArrays(mondayTemperatures, 
         tuesdayTemperatures);
              
      System.out.println("The temperatures on Monday and Tuesday were: " + 
         Arrays.toString(earlyWeekTemperatures));
   }
         
   /** Take two arrays and construct a new array that contains the contents of first, 
    *  followed by second.
    *
    *  @param first A perfect size array whose contents will be transferred 
    *  to the lower indices of the new array.
    *  @param second A perfect size array whose contents will be transferred 
    *  to the higher indices of the new array.
    *  @return A new array containing the contents of first followed by the 
    *  contents of second.
    */
   public static double[] joinArrays (double[] firstArray, double[] secondArray) {
      // The array to be returned will need to hold elements from both arrays
      double[] resultArray = new double[firstArray.length + secondArray.length];
      int index;

      // Move in the elements from first
      for (index = 0; index < firstArray.length; ++index) {
         resultArray[index] = firstArray[index];
      }
              
      // Move in the elements from second--remember to put them in result after 
      // the elements from first
      for (index = 0; index < secondArray.length; ++index) {
         resultArray[index + firstArray.length] = secondArray[index];
      }
              
      // Return the perfect sized result array
      return resultArray;
   }
}