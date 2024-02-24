package leetcode;

import java.util.Arrays;

public class Ex8 {
    private static int[]arr={5,2,4,5,2,3};
    private static int handle(int[]arr){
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[k]){
                k++;
                arr[k]=arr[i];

            }
        }
        return k;
    }

    public static void main(String[] args) {
        int k=handle(arr);
        for(int i=0;i<k+1;i++){
            System.out.println(arr[i]);
        }
    }
}
