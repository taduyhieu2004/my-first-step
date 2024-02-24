package quanlihocsinhthpt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
    public static List<Student> studentList = new ArrayList<>();

    public void inputNewStudent() {
        Student student = createStudent();
        studentList.add(student);
    }

    private static Student createStudent() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("name");
        student.setName(sc.next());
        System.out.println("age");
        student.setAge(sc.nextInt());
        System.out.println("home town");
        student.setHomeTown(sc.next());
        System.out.println("class");
        student.setClassStudent(sc.next());
        return student;
    }

    public void showStudent20yearold() {
        for (Student student : studentList) {
            if (student.getAge() == 20) {
                System.out.println(student);
            }
        }
    }

    public void calculateTheQuantity() {
        int count = 0;
        for (Student student : studentList) {
            if (student.getAge() == 23 && student.getHomeTown().equalsIgnoreCase("DN")) {
                count++;
            }

        }
        System.out.println(count);
    }

}
