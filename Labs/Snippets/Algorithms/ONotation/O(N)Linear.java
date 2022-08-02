	
LinearSearch(numbers, N, key) {
    for (i = 0; i < N; ++i) {
        if (numbers[i] == key) {
           return i
        }
     }
     
     return -1 // not found
  }