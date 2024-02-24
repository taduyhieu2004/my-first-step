package quanlithidaihoc;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Admissions a = new Admissions();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            a.showMenu();
            choose = sc.nextInt();
            switch (choose){
                case 1:{
                    a.inputData();
                    break;
                }
                case 2:{
                    a.showData();
                    break;
                }
                case 3:{
                    a.seachCandidateNumber();
                    break;

                }
                default:{
                    System.out.println("Exit");
                }
            }

        } while (choose != 4);
    }

}
