package baitap;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ICPC5 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    for (int t = 0; t < T; t++) {
      int n = scanner.nextInt();
      if (n < 0) {
        System.out.println(0);
        continue;
      }

      BigInteger result = calculateFirstTwoDigits(n);
      String s = String.valueOf(result);

      if (n > 1) {
        System.out.println(s.substring(s.length() - 2, s.length()));
      } else {
        System.out.println("0" + s.substring(s.length() - 1, s.length()));
      }
    }
  }

  private static BigInteger calculateFirstTwoDigits(int n) {
    BigDecimal a = new BigDecimal(2);
    BigDecimal b = new BigDecimal(Math.sqrt(3));

    BigDecimal pow = a.add(b).pow(n);

    BigInteger integerPart = pow.toBigInteger();
    return integerPart;
  }

}

