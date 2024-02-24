package baitap;

import java.util.Scanner;

public class Ex13 {
    private static int input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int handleNumber(int n) {
        int soDao = 0;
        while (n > 0) {
            soDao = soDao * 10 + n % 10;
            n /= 10;
        }
        return soDao;
    }

    private static void output(int n,int soDao) {

        boolean value;
        if (n == soDao) {
            value =true;
        } else {

            value=false;
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        int n = input();
        int x = handleNumber(n);
        output(n, x);
    }
}

