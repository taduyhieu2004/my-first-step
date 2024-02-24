package leetcode;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int a = 0; a < t; a++) {
            String s = scanner.nextLine();
            int[] s2 = new int[s.length()];
            int i = s.length() - 2;
            int j = s.length() - 3;
            int k = s.length() - 4;
            int r = s.length() - 5;

            while (i >= 0) {
                s2[i] = 2;
                if (j >= 0) {
                    s2[j] = 4;
                }

                if (k >= 0) {
                    s2[k] = 8;
                }

                if (r >= 0) {
                    s2[r] = 6;
                }

                i -= 4;
                j -= 4;
                k -= 4;
                r -= 4;
            }

            long sum = 0;
            for (int x = 0; x < s.length() - 1; x++) {
                if (s.charAt(x) == '0') {
                    continue;
                }
                    sum += s2[x];
                    System.out.println(sum);
                }


            if (s.charAt(s.length() - 1) == '1') {
                sum += 1;
            }

            if (sum % 5 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
