package leetcode;

import java.util.Arrays;

public class Ex31 {
    private static int lastRemaining(int n) {
        if(n==1){
            return 1;
        }
        int arr[]=new int [50];
        int x=1;
        int s=1;
        int i=1;
        int a=0;
        while (x<n){
            x=2*s;
            s+=2*i;
            i*=4;
            arr[a]=x;
            a++;



        }
        Arrays.sort(arr);
        return arr[48];

    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(9));

    }

}
