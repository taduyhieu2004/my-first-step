package vidu;


import java.sql.Date;
import java.time.LocalDate;

public class string {
    public static void main(String[] args) {
        long millis=System.currentTimeMillis();
        Date cr= new Date(millis);
        System.out.println(cr);
    }
}
