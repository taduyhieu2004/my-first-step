package quanlikháchan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    public static List<Person> personList = new ArrayList<>();

    public void showMenu() {
        System.out.println("1.input data");
        System.out.println("2.delete data");
        System.out.println("3.rent");
        System.out.println("4.show data");
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("name");
        person.setName(sc.next());
        System.out.println("age");
        person.setAge(sc.nextInt());
        System.out.println("id");
        person.setId(sc.next());
        System.out.println("Choose room");
        System.out.println("1.Room A");
        System.out.println("2.Room B");
        System.out.println("2.Room C");
        int choose = sc.nextInt();
        Room room = new Room();
        switch (choose) {

            case 1: {
                room.setCategory("A");
                room.setPrices(500);
                break;

            }
            case 2: {
                room.setCategory("B");
                room.setPrices(300);
                break;
            }
            case 3: {
                room.setCategory("C");
                room.setPrices(100);
                break;
            }
        }
        person.setRoom(room);
        System.out.println(" hire");
        person.setHire(sc.nextInt());
        personList.add(person);


    }

    public void deleteData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("id");
        String id = sc.next();
        for (Person person : personList) {
            if (person.getId().equalsIgnoreCase(id)) {
                personList.remove(person);
                break;
            }
        }
    }

    public void rent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("id");
        String id = sc.next();
        for (Person person : personList) {
            if (person.getId().equalsIgnoreCase(id)) {
                System.out.println("rent: " + (person.getHire() * person.getRoom().getPrices()));
                break;
            }

        }


    }

    public void showData() {
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
