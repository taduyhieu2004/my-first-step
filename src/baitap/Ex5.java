package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int n;
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap phan tu" + i);
            arr[i] = sc.nextInt();


        }
        for (int a:arr){System.out.println(a);
        }
        for (int i = 0; i < arr.length-1; i++) {
            int x = arr[i];
            for (int j = i + 1; j < arr.length ; j++) {
                if (x > arr[j]) {
                    arr[i] = arr[j];
                     arr[j]=x;
                    x = arr[i];

                }
            }
        }

        System.out.println("gia tri sap xep tang dan");
        for (int c : arr) {
            System.out.println(c);
        }
        for (int i = 0; i < arr.length-1; i++) {
            int x = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (x < arr[j]) {
                    arr[i] = arr[j];
                    arr[j]=x;
                    x = arr[i];

                }
            }
        }
        System.out.println("gia tri sap xep giam dan");
        for (int b : arr) {
            System.out.println(b);
        }
    }
}
