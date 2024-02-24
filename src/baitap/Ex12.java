package baitap;

import java.util.Scanner;

public class Ex12 {
    private static int input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int handleData(int n) {
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                System.out.println(i);
                n/=i;
            } else {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int n = input();
         n = handleData(n);

    }
}


