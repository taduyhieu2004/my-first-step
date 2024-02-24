package quanlikháchan;

public class Person {
    private String name;
    private int age;
    private String id;
    private Room room;
    private int hire;

    public int getHire() {
        return hire;
    }

    public void setHire(int hire) {
        this.hire = hire;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "name: "+name+" age: "+age+" id: "+id+room+" hire: "+hire;
    }
}
