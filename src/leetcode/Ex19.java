package leetcode;

import javax.management.StringValueExp;

public class Ex19 {


    private static int handleTrailingZeroes(int n) {
        int k = 0;
        while (n > 0) {
            n /= 5;
            k += n;
        }

        return k;

    }

    public static void main(String[] args) {

        System.out.println(handleTrailingZeroes(200));
    }


}
