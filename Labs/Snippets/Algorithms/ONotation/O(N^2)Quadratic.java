SelectionSort(numbers, N) { 
    for (i = 0; i < N; ++i) {
       indexSmallest = i
       for (j = i + 1; j < N; ++j) {
          if (numbers[j] < numbers[indexSmallest]) {
             indexSmallest = j
          }
       }
       
       temp = numbers[i]
       numbers[i] = numbers[indexSmallest]
       numbers[indexSmallest] = temp
 }