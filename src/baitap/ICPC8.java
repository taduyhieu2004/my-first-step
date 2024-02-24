package baitap;


import java.util.Scanner;


public class ICPC8 {
  private static int checkPrime(long n) {
    if (n < 2) {
      return 0;
    }
    for (long i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return 0;
      }
    }
    return 1;
  }

  private static int checkSumPrime(long n) {
    long sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return checkPrime(sum);
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();


    int count = 0;
    for (long i = 2; i <= n / 2; i++) {
      if (checkSumPrime( i) == 1 && checkSumPrime(n - 2 * i) == 1) {
        System.out.println(n - 2 * i + " " + 2 * i);
        count++;
      }
    }

    System.out.println(count);

  }

}
