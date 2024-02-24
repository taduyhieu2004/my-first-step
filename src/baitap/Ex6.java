package baitap;

import java.util.Scanner;

public class Ex6 {
    private static int[] input() {
        int n, s, x;
        int[] arr;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n :");
        n = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("nhap arr");
            arr[i] = sc.nextInt();

        }
        return arr;
    }

    private static int handleData1(int s, int x) {
        int a = s - x;
        return a;
    }

    private static void output(int a, int[] arr) {

        if (a > 0 && a < arr.length) {
            System.out.println("phan tu tai vi tri s-x la:" + arr[a]);
        } else {
            System.out.println("ko ton tai phan tu");

        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s ,x;
        System.out.println("nhap s :");
        s = sc.nextInt();
        System.out.println("nhap x :");
        x = sc.nextInt();
        int[] arr;
        arr=input();
        int a = handleData1(s, x);
        output(a,arr);

    }
}
