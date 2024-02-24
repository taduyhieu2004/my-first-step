package javaooptest;

public class Student {
    private String name;
    private int age;
    private String id;
    private String lop;



    public Student(String name , int age , String lop) {
        this.name = name;
        this.age =age;
        this.lop=lop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
