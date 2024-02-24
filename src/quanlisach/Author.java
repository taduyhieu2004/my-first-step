package quanlisach;

public class Author {
    private String name;
    private int age;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String toString() {
        return name + " age: " + age;
    }
}

