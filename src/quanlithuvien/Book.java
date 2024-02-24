package quanlithuvien;

import java.util.Scanner;

public class Book extends LibraryMaterials {
    private String author;
    private int numberOfPages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String toString() {
        return super.toString() + " Author: " + author + " number of page: " + numberOfPages;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("author");
        author = sc.next();
        System.out.println("number of page");
        numberOfPages = sc.nextInt();
    }
}
