package quanlithidaihoc;

import java.util.Scanner;

public class Student {
    private int candidateNumber;
    private String name;
    private String adress;
    private double priorityPoint;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCandidateNumber() {
        return candidateNumber;
    }

    public void setCandidateNumber(int candidateNumber) {
        this.candidateNumber = candidateNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriorityPoint() {
        return priorityPoint;
    }

    public void setPriorityPoint(double priorityPoint) {
        this.priorityPoint = priorityPoint;
    }
    public String toString(){
        return "candidateNumber: "+candidateNumber+" name: "+name+" adress: "+adress+" priorityPoin: "+priorityPoint;
    }
//    public void input(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("candidateNumber");
//        candidateNumber=sc.nextInt();
//        System.out.println("name");
//        name=sc.next();
//        System.out.println("adress");
//        adress=sc.next();
//        System.out.println("priorityPoint");
//        priorityPoint=sc.nextInt();
//    }

}
