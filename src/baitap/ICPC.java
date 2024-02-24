package baitap;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ICPC {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    BigDecimal result = handle(s);
    if (result.stripTrailingZeros().scale() <= 0) {
      System.out.println(result.toBigInteger());
    } else {
      BigInteger[] fractionalPart = handleFractionalPart(result);
      System.out.println(result.toBigInteger() + " " + fractionalPart[0] + "/" + fractionalPart[1]);
    }
  }

  private static BigDecimal handle(String s) {
    char[] arr = s.toCharArray();
    BigDecimal sum = BigDecimal.ZERO;
    int x = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
      BigDecimal y = new BigDecimal("1.5").pow(x++);
      BigDecimal digit = BigDecimal.valueOf(arr[i] - '0');
      sum = sum.add(digit.multiply(y));
    }
    return sum;
  }

  private static BigInteger[] handleFractionalPart(BigDecimal res) {
    BigInteger y = BigDecimal.TEN.pow(res.scale()).toBigInteger();
    BigInteger x = res.multiply(new BigDecimal(y)).toBigInteger();
    BigInteger z = x.gcd(y);
    x = x.divide(z);
    y = y.divide(z);

    BigInteger[] arr = {x, y};
    return arr;
  }
}