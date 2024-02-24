package sonhiphan;

import java.util.Scanner;

public class SoNhiPhanx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("nhập giá trị của a");
        a = sc.nextInt();
        String nhiPhan = "";
        do {
            nhiPhan = (a % 2) + nhiPhan;
            a = a / 2;
        } while (a > 0);
        System.out.println("số nhị phân là" + nhiPhan);
    }
}
