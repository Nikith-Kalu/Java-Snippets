public class InsertionSort {
    public static void insertionSort(int [] numbers) {
       int i;
       int j;
       int temp;      // Temporary variable for swap
 
       for (i = 1; i < numbers.length; ++i) {
          j = i;
          // Insert numbers[i] into sorted part 
          // stopping once numbers[i] in correct position
          while (j > 0 && numbers[j] < numbers[j - 1]) {
 
             // Swap numbers[j] and numbers[j - 1]
             temp = numbers[j];
             numbers[j] = numbers[j - 1];
             numbers[j - 1] = temp;
             --j;
          }
       }
    }
 
    public static void main(String [] args) {
       int [] numbers = {10, 2, 78, 4, 45, 32, 7, 11};
       int i;
 
       System.out.print("UNSORTED: ");
       for (i = 0; i < numbers.length; ++i) {
          System.out.print(numbers[i] + " ");
       }
       System.out.println();
 
       insertionSort(numbers);
 
       System.out.print("SORTED: ");
       for (i = 0; i < numbers.length; ++i) {
          System.out.print(numbers[i] + " ");
       }
       System.out.println();
    }
 }