package quanlisach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Book> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Author author1 = new Author("hieu",18);
        Author author2 = new Author("hieu",19);
        Producer x = new Producer("VietNam");
        Producer y = new Producer("USA");
        Book a = new Book(sc.next(), author1, x);
        Book b = new Book(sc.next(), author2, y);
        arr.add(a);
        arr.add(b);
        for (Book o : arr) {
            System.out.println(o);

        }
    }
}