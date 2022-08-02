Fibonacci(N) {
    if ((1 == N) || (2 == N)) {
      return 1
    }
    return Fibonacci(N-1) + Fibonacci(N-2)
  }