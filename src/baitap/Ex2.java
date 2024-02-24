package baitap;

import java.util.Scanner;

public class Ex2 {
    private static int input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void output(int n, int s, int i) {
        i = 2;
        while (i <= n) {
            s += i;
            i += 2;
        }
        System.out.println("tong cac gia tri chan la"+s);

    }
    public static void main(String[] args) {
        int n;
        int s = 0;
        int i = 2;
        System.out.println("nhap gia tri cua n");
        n = input();
        output(n, s, i);
    }
}
