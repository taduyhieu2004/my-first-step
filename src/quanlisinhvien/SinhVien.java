package quanlisinhvien;

public class SinhVien {
    private String id;
    private String name;
    private double theoreticalPoint;
    private double practicePoints;

    public SinhVien() {

    }

    public double diemTB() {
        return (getDiemLiThuyet() + getDiemThucHanh()) / 2;
    }

    public String getMaSinhVien() {
        return id;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.id = maSinhVien;
    }

    public String getHoVaTen() {
        return name;
    }

    public void setHoVaTen(String hoVaTen) {
        this.name = hoVaTen;
    }

    public double getDiemThucHanh() {
        return practicePoints;
    }

    public void setDiemThucHanh(int diemThucHanh) {
        this.practicePoints = diemThucHanh;
    }

    public double getDiemLiThuyet() {
        return theoreticalPoint;
    }

    public void setDiemLiThuyet(int diemLiThuyet) {
        this.theoreticalPoint = diemLiThuyet;
    }

    public String toString() {
        return String.format("%10s%20s%10f%10f%10f",id,name,theoreticalPoint,practicePoints,diemTB());

    }



}
