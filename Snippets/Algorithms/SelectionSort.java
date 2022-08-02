public class SelectionSort {
    public static void selectionSort(int [] numbers) {
       int i;
       int j;
       int indexSmallest;
       int temp;      // Temporary variable for swap
 
       for (i = 0; i < numbers.length - 1; ++i) {
 
          // Find index of smallest remaining element
          indexSmallest = i;
          for (j = i + 1; j < numbers.length; ++j) {
 
             if (numbers[j] < numbers[indexSmallest]) {
                indexSmallest = j;
             }
          }
 
          // Swap numbers[i] and numbers[indexSmallest]
          temp = numbers[i];
          numbers[i] = numbers[indexSmallest];
          numbers[indexSmallest] = temp;
       }
    }
 
    public static void main(String [] args) {
       int numbers [] = {10, 2, 78, 4, 45, 32, 7, 11};
       int i;
 
       System.out.print("UNSORTED: ");
       for (i = 0; i < numbers.length; ++i) {
          System.out.print(numbers[i] + " ");
       }
       System.out.println();
 
       /* initial call to selection sort with index */
       selectionSort(numbers);
 
       System.out.print("SORTED: ");
       for (i = 0; i < numbers.length; ++i) {
          System.out.print(numbers[i] + " ");
       }
       System.out.println();
    }
 }