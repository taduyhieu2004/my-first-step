package baitap;

import java.util.Scanner;

public class Ex9 {
    private static int[] input() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap n");
        n = sc.nextInt();
        int arr[];
        arr = new int[n];
        System.out.println("nhap arr");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        return arr;
    }

    private static int handleMin(int arr[]) {
        int min = arr[0];
        int vitri1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                vitri1 = i;
            }
        }
        return vitri1;
    }

    private static int handleMax(int arr[]) {
        int max = arr[0];
        int vitri2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                vitri2 = i;
            }
        }
        return vitri2;
    }

    private static void output(int vitri1, int vitri2) {
        System.out.println("vi tri 2 phan tu co hieu lon nhat la" + vitri1 + "va" + vitri2);

    }

    public static void main(String[] args) {
        int arr[] = input();
        int vitri1 = handleMin(arr);
        int vitri2 = handleMax(arr);
        output(vitri1, vitri2);
    }
}

