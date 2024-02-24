package quanlithuvien;

import java.util.Scanner;

public class Magazine extends LibraryMaterials {
    private int issueNumber;
    private int releaseMonth;

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public String toString() {
        return super.toString() + " issueNumber: " + issueNumber + " release mmonth: " + releaseMonth;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("issue number");
        issueNumber = sc.nextInt();
        System.out.println("release month");
        releaseMonth = sc.nextInt();
    }
}
