package quanlithuvien;

import java.util.*;

public class LibraryManagement {
    public static Map<String, List> map = new HashMap<>();
    public static List<LibraryMaterials> books = new ArrayList<>();
    public static List<LibraryMaterials> magazines = new ArrayList<>();
    public static List<LibraryMaterials> newspapers = new ArrayList<>();
    public static List<LibraryMaterials> materials = new ArrayList<>();

    public void showMenu() {
        System.out.println("1.Input data");
        System.out.println("2.Remove data");
        System.out.println("3.Show data");
        System.out.println("4.Seach data");
        System.out.println("5.Exit");

    }

    public void inputData() {
        LibraryMaterials libraryMaterials = createLibraryMaterials();
        materials.add(libraryMaterials);
        map.put("book", books);
        map.put("magazines", magazines);
        map.put("newspaper", newspapers);


    }

    private static LibraryMaterials createLibraryMaterials() {
        Scanner sc = new Scanner(System.in);
        LibraryMaterials libraryMaterials;
        System.out.println("1.Book");
        System.out.println("2.Magazine");
        System.out.println("3.Newpaper");
        int choose = sc.nextInt();
        switch (choose) {
            case 1: {
                libraryMaterials = new Book();
                books.add(libraryMaterials);
                break;
            }
            case 2: {
                libraryMaterials = new Magazine();
                magazines.add(libraryMaterials);
                break;
            }
            default: {
                libraryMaterials = new Newspaper();
                newspapers.add(libraryMaterials);
            }
        }
        libraryMaterials.input();
        return libraryMaterials;

    }

    public void removeData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("remove id:");
        int id = sc.nextInt();
        for (LibraryMaterials o : materials) {
            if (o.getId() == id) {
                materials.remove(o);
                break;

            }

        }
    }

    public void showData() {
        for (LibraryMaterials o : materials) {
            System.out.println(o);
        }
    }

    public void seachbyData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Seach Book");
        System.out.println("2.Seach Newspaper");
        System.out.println("3.Seach Magazine");
        int chose = sc.nextInt();
        switch (chose) {
            case 1: {
                System.out.println(map.get("book"));
                break;

            }
            case 2: {
                System.out.println(map.get("newspaper"));
                break;
            }
            case 3: {
                System.out.println(map.get("magazines"));
                break;
            }

        }
    }

}



