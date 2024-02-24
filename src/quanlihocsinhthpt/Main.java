package quanlihocsinhthpt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School a = new School();
        int choose;
        do {
            System.out.println("1.input new Student");
            System.out.println("2.information student 20 year old");
            System.out.println("3.number of students 23 years old and home town at DN");
            choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    a.inputNewStudent();
                    break;
                }
                case 2: {
                    a.showStudent20yearold();
                    break;
                }
                case 3: {
                    a.calculateTheQuantity();
                    break;
                }
                default: {
                    System.out.println("choose 4 to exit");
                }
            }

        } while (choose != 4);
    }
}
