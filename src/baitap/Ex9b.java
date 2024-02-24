package baitap;

import java.util.Scanner;

public class Ex9b {
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
            System.out.println("ngay " + (i + 1) + " vang co gia tien la " + arr[i] + " trieu");
        }
        return arr;
    }

    private static int[] hanldleData1(int[] arr) {
        int x = 0, y = 0;
        int z = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[z] > arr[i]) {
                z = i;
            } else if (arr[i] - arr[z] >= arr[y] - arr[x]) {

                x = z;
                y = i;


            }

        }
        int []arr1={x,y};
        return arr1;

    }

//    private static int hanldleData2(int[] arr) {
//        int x = 0, y = 0;
//        int z = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[z] > arr[i]) {
//                z = i;
//            } else if (arr[i] - arr[z] >= arr[y] - arr[x]) {
//                x = z;
//                y = i;
//
//            }
//
//        }
//        return y;



    private static void output(int[]result) {

        System.out.println("ngay mua vao la ngay " +( result[0]+1) + " ngay ban ra la " + (result[1]+1));


    }

    public static void main(String[] args) {
        int arr[]=input();
//        int x=hanldleData1(arr);
//        int y=hanldleData2(arr);
        int []result=hanldleData1(arr);
        output(result);
    }
}
