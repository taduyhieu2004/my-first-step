package quanlisinhvien;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> sv = new ArrayList<>();
        SinhVien a = new SinhVien();
        a.setMaSinhVien("B22DCCN1");
        a.setHoVaTen("nguyen van a");
        a.setDiemLiThuyet(7);
        a.setDiemThucHanh(9);
        SinhVien b = new SinhVien();
        b.setMaSinhVien("B22DCCN2");
        b.setHoVaTen("nguyen van b");
        b.setDiemLiThuyet(7);
        b.setDiemThucHanh(10);
        SinhVien c = new SinhVien();
        c.setMaSinhVien("B22DCCN3");
        c.setHoVaTen("ta duy hieu");
        c.setDiemLiThuyet(6);
        c.setDiemThucHanh(6);

        sv.add(a);
        sv.add(b);
        sv.add(c);

        System.out.printf("%10s%20s%10s%10s%10s", "id", "name", "diem LT", "diem TH","GPA");
        System.out.println("");
        for (SinhVien o : sv) {
            System.out.println(o);
        }


    }
}
