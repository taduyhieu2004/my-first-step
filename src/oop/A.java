package oop;

public abstract class A {
  private String name;
  private String age;

  public A(String name, String age) {
    this.name = name;
    this.age = age;
  }

  public static String run() {
    return null;
  }

  public String getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }
}
