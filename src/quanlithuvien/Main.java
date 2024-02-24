package quanlithuvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManagement a = new LibraryManagement();
        Scanner sc = new Scanner(System.in);
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
                    a.removeData();
                    break;
                }
                case 3: {
                    a.showData();
                    break;
                }
                case 4: {
                   a.seachbyData();
                    break;
               }
                default: {
                    System.out.println("Exit");
                }
            }


        } while (choose != 5);
    }
}
