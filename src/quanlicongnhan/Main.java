package quanlicongnhan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        QLCB a = new QLCB();
        do {
            a.showMenu();
            choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    a.inputData();
                    break;
                }
                case 2: {
                    a.seachByName();
                    break;
                }
                case 3: {
                    a.showData();
                    break;
                }
                default: {
                    System.out.println("Exit");
                    break;
                }

            }
            a=new QLCB();
        }
        while (choose != 4);


    }
}
