package quanlisinhvien2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> stu = new ArrayList<>();
        Student a = new Student();
        a.setId("B22DCCN1");
        a.setName("nguyen van a");
        a.setTheoreticalPoint(7);
        a.setPracticePoints(8);
        Student b = new Student();
        b.setId("B22DCCN2");
        b.setName("ta van b");
        b.setTheoreticalPoint(10);
        b.setPracticePoints(9);
        Student c = new Student();
        c.setId("B22DCCN3");
        c.setName("ta duy hieu");
        c.setTheoreticalPoint(6);
        c.setPracticePoints(6);
        stu.add(a);
        stu.add(b);
        stu.add(c);
        System.out.printf("%10s%20s%20s%20s%10s", "id", "name", "theretical point", "preactice point", "GPA");
        System.out.println("");
        for (Student o : stu) {
            System.out.println(o);
        }


    }
}
