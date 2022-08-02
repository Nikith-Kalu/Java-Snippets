MergeSort(numbers, i, k) {
    j = 0
    if (i < k) {
       j = (i + k) / 2              // Find midpoint 
       
       MergeSort(numbers, i, j)     // Sort left part
       MergeSort(numbers, j + 1, k) // Sort right part
       Merge(numbers, i, j, k)      // Merge parts
    }
 }