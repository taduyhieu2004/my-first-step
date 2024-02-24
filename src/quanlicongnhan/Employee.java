package quanlicongnhan;

import java.util.Scanner;

public class Employee extends Cadres {
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public String toString(){
        return super.toString()+" level: "+level;
    }
    public void input(){
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("level");
        level=sc.nextInt();
    }
}
