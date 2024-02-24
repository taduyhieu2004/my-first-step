package quanlicongnhan;

import java.util.Scanner;

public class Cadres {

    private String name;
    private int age;
    private String sex;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "name: " + name + " age: " + age + " sex: " + sex + " address:" + address;
    }

    public void disPlay() {
        System.out.println(this);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("name");
        name = sc.nextLine();
        System.out.println("age");
        age = sc.nextInt();
        System.out.println("sex");
        sex=sc.next();
        System.out.println("address");
        address = sc.next();
    }
}
