package quanlidancu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Family inputFamily() {
        Scanner sc = new Scanner(System.in);
        Family family = new Family();
        System.out.println("house number");
        family.setHouseNumber(sc.nextInt());
        System.out.println("member of family");
        family.setMembersOfFamily(sc.nextInt());
        return family;


    }

    private static People inputPeople() {
        Scanner sc = new Scanner(System.in);
        People people = new People();
        System.out.println("name");
        people.setName(sc.next());
        System.out.println("age");
        people.setAge(sc.nextInt());
        System.out.println("job");
        people.setJob(sc.next());
        System.out.println("id");
        people.setId(sc.nextInt());
        return people;
    }

    private static void output(List<Family> familyList) {
        for (Family family : familyList) {
            System.out.println(family);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Civilgroup civilgroup = new Civilgroup();
        List<Family> familiesList = new ArrayList<>();
        System.out.println("numbers of family");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Family family = inputFamily();
            List<People> people = new ArrayList<>();
            for (int j = 0; j < family.getMembersOfFamily(); j++) {
                People people1 = inputPeople();
                people.add(people1);
            }
            family.setPeople(people);
            familiesList.add(family);

        }
        civilgroup.setFamilies(familiesList);

        output(familiesList);
    }


}

