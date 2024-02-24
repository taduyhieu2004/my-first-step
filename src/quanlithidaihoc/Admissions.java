package quanlithidaihoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admissions {
    public static List<Student> stu = new ArrayList<>();

    public void showMenu() {
        System.out.println("1. Input Data");
        System.out.println("2. Show Data");
        System.out.println("3. Seach CandidateNumber");
        System.out.println("4.Exit");
    }

    public void inputData() {
        Student student = createStudent();
        stu.add(student);

    }

    private static Student createStudent() {
        Scanner sc = new Scanner(System.in);
        Student student;
        System.out.println("1.A Student");
        System.out.println("2.B Student");
        System.out.println("3.C Student");
        int choose = sc.nextInt();
        switch (choose) {
            case 1: {
                student = new Astudent();
                break;
            }
            case 2: {
                student = new Bstudent();
                break;
            }
            default: {
                student = new Cstudent();
            }

        }
        System.out.println("candidateNumber");
        student.setCandidateNumber(sc.nextInt());
        System.out.println("name");
        student.setName(sc.next());
        System.out.println("adress");
        student.setAdress(sc.next());
        System.out.println("priorityPoint");
        student.setPriorityPoint(sc.nextDouble());

        return student;

}

    public void showData() {
        for (Student o : stu) {
            System.out.println(o);
        }
    }

    public void seachCandidateNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("cadidate number");
        int cadidatenumber = sc.nextInt();
        for (Student o : stu) {
            if (o.getCandidateNumber() == cadidatenumber) {
                System.out.println(o);
            }
        }
    }
}
