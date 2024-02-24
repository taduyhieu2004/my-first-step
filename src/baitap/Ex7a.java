package baitap;

import java.util.Scanner;

public class Ex7a {
    private static int input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int docSo(int chuSo) {
        if (chuSo == 0) {
            System.out.println("khong");
        } else if (chuSo == 1) {
            System.out.println("mot");

        } else if (chuSo == 2) {
            System.out.println("hai");
        } else if (chuSo == 3) {
            System.out.println("ba");
        } else if (chuSo == 4) {
            System.out.println("bon");
        } else if (chuSo == 5) {
            System.out.println("nam");
        } else if (chuSo == 6) {
            System.out.println("sau");
        } else if (chuSo == 7) {
            System.out.println("bay");
        } else if (chuSo == 8) {
            System.out.println("tam");
        } else if (chuSo == 9) {
            System.out.println("chin");
        }
        return chuSo;
    }
    private static int demSoLuongChuSo (int n){

        int dem =0;
        while (n>0){
            n/=10;
            dem++;

        }
        return dem ;

    }
    private static void output(int n){
        int x=0;
        while (n>0){
            x=x*10+n%10;
            n/=10;
        }
        int soLuong =demSoLuongChuSo(x);
        while (x>0){
           docSo(x%10);
           if (soLuong==4){
               System.out.println("nghin");}
            if (soLuong==3){
                System.out.println("tram");}
            if (soLuong==2){
                System.out.println("muoi");}
            soLuong--;
            x/=10;

        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("nhap n");
        n=input();

        output(n);

    }
}
