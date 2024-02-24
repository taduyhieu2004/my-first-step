package quanlicongnhan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    public static List<Cadres> cadresList = new ArrayList<>();
    private static Scanner sc= new Scanner(System.in);

    public void showMenu() {
        System.out.println("1.input data");
        System.out.println("2.Seach by name");
        System.out.println("3.Show data");
        System.out.println("4.Exit");

    }


    public void inputData() {
        Cadres cadres = createCadres();
        cadresList.add(cadres);

    }

    private static Cadres createCadres() {
        Cadres cadres;
//        Scanner sc = new Scanner(System.in);
        System.out.println("1.Engineers");
        System.out.println("2.Staff");
        System.out.println("3.Employee");
        int choose = sc.nextInt();
        switch (choose) {
            case 1: {
                cadres = new Engineers();
                break;
            }
            case 2: {
                cadres = new Staff();
                break;

            }
            default: {
                cadres = new Employee();
                break;
            }

        }
        cadres.input();
        return cadres;

    }

    public void seachByName() {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Name");
        String name = sc.nextLine();
        for (Cadres o : cadresList) {
            if (o.getName().equalsIgnoreCase(name)) {
                o.disPlay();


            }
        }


    }

    public void showData() {
        for (Cadres o : cadresList) {
            o.disPlay();

        }
    }
}
