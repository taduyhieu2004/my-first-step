package leetcode;

import javax.management.StringValueExp;

public class Ex45 {
    private static String multiply(String num1, String num2) {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        long s = x * y;
        String z = String.valueOf(s);
        return z;

    }

    public static void main(String[] args) {
        System.out.println(multiply("123456789","987654321"));
    }
}
