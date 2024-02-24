package regex;

import java.util.Scanner;

public class fuck {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                int[] primes = new int[n + 1];

                for (int j = 2; j <= n; j++) {
                    int num = j;
                    for (int k = 2; k <= j; k++) {
                        while (num % k == 0) {
                            primes[k]++;
                            num /= k;
                        }
                    }
                }

                long result = 1;
                for (int j = 2; j <= n; j++) {
                    if (primes[j] > 0) {
                        result *= Math.pow(j, primes[j]);
                    }
                }

                System.out.println(result);
            }
        }
    }
