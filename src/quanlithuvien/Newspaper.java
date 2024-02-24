package quanlithuvien;

import java.util.Scanner;

public class Newspaper extends LibraryMaterials {
    private String releaseDate;

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String toString() {
        return super.toString() + " release date:" + releaseDate;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("releaseDate");
        releaseDate = sc.next();
    }
}
