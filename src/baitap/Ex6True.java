package baitap;

import java.util.Scanner;

public class Ex6True {
    private static int[] input() {
        int n;
        int[] arr;
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

    private static int handleData(int s, int x) {
        return s - x;
    }




    private static void output(int[] arr, int a) {
        int i;
        for (i = 0; i < arr.length; i++) {

            if (a == arr[i]) {System.out.println("vi tri cua phan tu s-x la" + i);
                break;
            }
        }
        if (i == arr.length) {System.out.println("ko ton tai phan tu");
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, x;
        System.out.println("nhap s :");
        s = sc.nextInt();
        System.out.println("nhap x :");
        x = sc.nextInt();
        int a = handleData(s, x);
        System.out.println("a=" + a);
        int arr[] = input();
        output(arr, a);
    }
}



