package baitap;

import java.util.Scanner;

public class Ex1 {
    private static double input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static void output(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("ko là 3 cạnh của tam giác");
        } else if (a + b <= c && a + c <= b && b + c <= a) {
            System.out.println("ko là 3 cạnh của tam giác");
        } else if (a == b && a == c && c == b) {
            System.out.println("là 3 cạnh của tam giác đều");

        } else if (a == b && a != c || a == c && a != b || b == c && b != a) {
            System.out.println("là 3 cạnh của tam giác cân");

        } else if (c == Math.sqrt(a * a + b * b) || b == Math.sqrt(a * a + c * c) || a == Math.sqrt(c * c + b * b)) {
            System.out.println("là 3 cạnh của tam giác vuông");

        } else {
            System.out.println("là 3 cạnh của tam giác");
        }
    }

    public static void main(String[] args) {
        double a, b, c;
        System.out.println("nhập giá trị của a");
        a = input();
        System.out.println("nhập giá trị của b");
        b = input();
        System.out.println("nhập giá trị của c");
        c = input();
        output(a, b, c);
    }
}
