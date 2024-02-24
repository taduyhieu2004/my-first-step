package baitap;

import java.util.Scanner;

public class Ex5a {
    private static int[] input() {
        int n ;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n :");
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap arr");
            arr[i] = sc.nextInt();

        }
        return arr;

    }

    private static int[] handleData1(int arr[]) {


        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (x > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = x;
                    x = arr[i];
                }

            }

        }
        return arr;
    }


    private static int[] handleData2(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (x < arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = x;
                    x = arr[i];
                }
            }

        }
        return arr;
    }

    private static void output(int[] arr) {
        for (int a : arr) {
            System.out.println(a);

        }
    }


    public static void main(String[] args) {
        int arr[];
        arr = input();
        int[] arr1 = handleData1(arr );
        System.out.println("thu tu tang dan la");
        output(arr1);
//        System.out.println("thu tu tang dan" + handleData1(arr,n));
        int[] arr2 = handleData2(arr);
        System.out.println("thu tu giam dan la");
        output(arr2);
//        System.out.println("thu tu giam dan" + handleData2(arr,n));
//        output(arr,n);

    }
}