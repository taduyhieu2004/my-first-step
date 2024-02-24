package leetcode;

import java.util.Scanner;

public class Ex9 {
    private static int input() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    private static int hanlde(int n) {
        long y = 0;
        if (n > 0) {
            while (n > 0) {
                y = y * 10 + n % 10;
                n /= 10;
            }
        }
        if (y > 2147483647) {
            return 0;
        }

        if (n < 0) {
            int x = -n;
            long z = 0;
            while (x > 0) {
                z = z * 10 + x % 10;
                x /= 10;

            }

            y = -z;

        }
        if (y < -2147483648) {
            return 0;
        }


        return (int) y;
    }

    public static void main(String[] args) {
        int n = input();
        long y = hanlde(n);
        System.out.println(y);
    }

}
