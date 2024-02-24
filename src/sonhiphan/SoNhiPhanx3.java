package sonhiphan;

import java.util.Scanner;

public class SoNhiPhanx3 {
    private static int input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private static String handlenhiphan(int a) {
        String nhiPhan = "";
        do {
            nhiPhan = (a % 2) + nhiPhan;
            a = a / 2;
        } while (a > 0);
        return nhiPhan;
    }
    private static void output(int a) {
        if (a > 0) {
            System.out.println("thỏa mãn");
        } else {
            System.out.println("ko thỏa mãn");
        }
    }
    public static void main(String[] args) {
        int a;
        System.out.println("nhập số a");
        a = input();
        output(a);
        String nhiPhan = "";
        nhiPhan = handlenhiphan(a);
        System.out.println("số nhị phân là :" + nhiPhan);
    }
}





