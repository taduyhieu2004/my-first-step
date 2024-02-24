package quanlicongnhan;

import java.util.Scanner;

public class Staff extends Cadres {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String toString(){
        return super.toString()+" job:"+job;

    }
    public void input(){
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("job");
        job=sc.nextLine();
    }
}
