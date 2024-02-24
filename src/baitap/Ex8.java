package baitap;

import java.util.Scanner;

public class Ex8 {
    private static int[] input() {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
//            System.out.println("nhap arr");
            arr[i] = sc.nextInt();

        }
        return arr;
    }

    private static int[] handleData1(int[] arr) {
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

    private static int[] handleData2(int[] arr1, int[] arr2) {
        int x = 0;
        int[] arr;
        arr = new int[10];
//        for (int i = 0; i < 5; i++) {
        for(int a:arr1){
            arr[x] = a;
            x++;
        }
//        for (int i = 0; i < 5; i++) {
        for (int b:arr2){
            arr[x] = b;
            x++;
        }
        return arr;
    }

    private static void output(int[] arr) {
//        System.out.println("sap xep theo gia tri tang dan la");
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        System.out.println("nhap arr1");
        int[] arr1 = input();
        System.out.println("nhap arr2");
        int[] arr2 = input();
        int[] arr = handleData2(arr1, arr2);
        int[] arr3 = handleData1(arr);
        System.out.println("sap xep theo gia tri tang dan la");
        output(arr3);

    }
}



