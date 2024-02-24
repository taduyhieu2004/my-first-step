package quanlihocsinhthpt;

public class Student {
    private String name;
    private int age;
    private String homeTown;
    private String classStudent;

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String toString() {
        return "name: " + name + " age: " + age + " home town: " + homeTown + " class: " + classStudent;
    }
}
