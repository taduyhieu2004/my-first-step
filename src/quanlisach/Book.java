package quanlisach;

public class Book {
    static int count = 1;
    private int id;
    private String name;

    private Author author;
    private Producer producer;



    public int getId() {
        return id;
    }

    public Book(String name, Author author, Producer producer) {
        id = count++;
        this.name = name;
        this.author = author;
        this.producer = producer;
    }


    public String toString() {
        return "Id Book: "+getId()+ " Name: " + name + " Author: " + author + " Producer: " + producer;
    }

}


