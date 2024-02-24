package quanligiaovien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TeacherManagement a = new TeacherManagement();
        int choose;
        do {
            System.out.println("1.input teacher");
            System.out.println("2.delete teacher");
            System.out.println("3.payroll");
            choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    a.inputTeacher();
                    break;
                }
                case 2: {
                    a.deleteTeacher();
                    break;
                }
                case 3: {

                    a.payRoll();
                }
            }
        } while (choose != 4);
    }
}
