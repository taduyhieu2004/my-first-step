package baitap;

import java.math.BigInteger;
import java.util.Scanner;

public class Tesstn {

    public static boolean isPrime(BigInteger n) {
      if (n.compareTo(BigInteger.ONE) <= 0) {
        return false;
      }
      for (BigInteger i = BigInteger.TWO; i.compareTo(n.sqrt()) <= 0; i = i.add(BigInteger.ONE)) {
        if (n.mod(i).equals(BigInteger.ZERO)) {
          return false;
        }
      }
      return true;
    }

    public static int sumOfDigits(BigInteger n) {
      int total = 0;
      BigInteger ten = BigInteger.TEN;
      while (n.compareTo(BigInteger.ZERO) > 0) {
        total += n.mod(ten).intValue();
        n = n.divide(ten);
      }
      return total;
    }

    public static int countSpecialPairs(BigInteger N) {
      int count = 0;
      BigInteger two = BigInteger.valueOf(2);
//      BigInteger halfN = N.divide(two);
      for (BigInteger x = BigInteger.TWO; x.compareTo(N) < 0; x = x.add(BigInteger.ONE)) {
        BigInteger y = N.subtract(x).divide(two);
        if (isPrime(BigInteger.valueOf(sumOfDigits(x))) && isPrime(BigInteger.valueOf(sumOfDigits(y)))) {
          count++;
        }
      }
      return count;
    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      BigInteger N = scanner.nextBigInteger();
      int result = countSpecialPairs(N);
      System.out.println(result);
    }
  }