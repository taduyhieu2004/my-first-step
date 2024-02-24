package baitap;

import java.util.Optional;
import java.util.Scanner;

public class ICPC4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, m;

    do {
      n = sc.nextInt();
      m = sc.nextInt();
      if (n == 0) {
        System.out.println(handle(m));
      } else {


        long sum = handle(n);
        long sum2 = handle(m / 2);
        long sum3 = handle(m - m / 2);
        System.out.println(sum - sum2 - sum3);
      }
    } while (n != 0 || m != 0);
  }

  private static long handle(int n) {
    if (n == 0) {
      return 0;
    }
    int x = 1;
    int y = 1 + 2 * (n - 1);
    long sum = (y + x) * n / 2;
    return sum;
  }
}
