package sonhiphan;

import java.util.Scanner;

public class sonhiphan {
    private static int input() {

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void output(int a) {
        String nhiPhan = "";
        while (a > 0) {
            nhiPhan = (a % 2) + nhiPhan;
            a /= 2;
        }
        System.out.println("Số nhị phân là :" + nhiPhan);

    }

    ;

    public static void main(String[] args) {
        int a;
        System.out.println("nhập số hạng của a :");
        a = input();
        output(a);
    }
}




