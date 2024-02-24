package testsort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Anh", 16));
        list.add(new Student("Tuan", 17));
        list.add(new Student("Ha", 13));
        Collections.sort(list, new AgeComparator());
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
