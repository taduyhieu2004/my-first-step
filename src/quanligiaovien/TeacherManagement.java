package quanligiaovien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherManagement {
    public static List<Teacher> teacherList = new ArrayList<>();

    public void inputTeacher() {
        Scanner sc = new Scanner(System.in);
        Teacher teacher = new Teacher();
        System.out.println("name");
        teacher.setName(sc.next());
        System.out.println("age");
        teacher.setAge(sc.nextInt());
        System.out.println("home town");
        teacher.setHomeTown(sc.next());
        System.out.println("id");
        teacher.setId(sc.next());
        teacherList.add(teacher);
    }

    public void deleteTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("id");
        String id = sc.next();
        for (Teacher teacher : teacherList) {
            if (teacher.getId().equalsIgnoreCase(id)) {
                teacherList.remove(teacher);
            }
        }
    }

    public void payRoll() {
        Scanner sc = new Scanner(System.in);
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.getName());
            System.out.println("base salary");
            teacher.setBaseSalary(sc.nextInt());
            System.out.println("bonus salary");
            teacher.setBonusSalary(sc.nextInt());
            System.out.println("minus salary");
            teacher.setMinusSalary(sc.nextInt());
            System.out.println(teacher.getBaseSalary() + teacher.getBonusSalary() - teacher.getMinusSalary());
        }

    }
}

