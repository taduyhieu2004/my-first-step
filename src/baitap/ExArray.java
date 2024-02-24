package baitap;

import java.util.Scanner;

public class ExArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int n,k;
        while (t-- >0) {
            n = sc.nextInt();
            k = sc.nextInt();
            for (int i=1;i<=k;i++) {
                n = n + n%100;
                System.out.println(n);
            }
            System.out.println(n);
        }
    }
}
