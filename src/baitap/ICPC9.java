package baitap;


import java.util.*;
import java.util.stream.Collectors;


public class ICPC9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long N = scanner.nextLong();

    long count = countSpecialPairs(N);
    System.out.println(count);
  }

  private static boolean isPrime(long num) {
    if (num < 2) {
      return false;
    }
    for (long i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  private static long countSpecialPairs(long N) {
    long count = 0;
    for (long x = 1; x <= N / 2; x++) {
      long y = (N - x) / 2;
      if (isPrime(sumOfDigits(x)) && isPrime(sumOfDigits(y))) {
        count++;
      }
    }
    return count;
  }

  private static long sumOfDigits(long num) {
    long sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }
}