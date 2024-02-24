package quanlikháchan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel a = new Hotel();
        int choose;

        do {
            a.showMenu();
            choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    a.inputData();
                    break;
                }
                case 2: {
                    a.deleteData();
                    break;
                }
                case 3: {
                    a.rent();
                    break;
                }
                case 4: {
                    a.showData();
                    break;
                }
                default: {
                    System.out.println("choose 5 to exit");
                }
            }

        } while (choose != 5);

    }
}
