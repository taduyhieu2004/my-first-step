package quanlithuvien;

import java.util.Scanner;

public class LibraryMaterials {
    private int id;
    private String produce;
    private int releaseNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public String toString() {
        return "id: " + id + "  produce: " + produce + " releaseNumber: " + releaseNumber;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("id");
        id = sc.nextInt();
        System.out.println("producer");
        produce = sc.next();
        System.out.println("releaseNumber");
        releaseNumber = sc.nextInt();

    }

}
