package quanlicongnhan;

import java.util.Scanner;

public class Engineers extends Cadres {
    private String trainingIndustry;

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }
    public String toString(){
        return super.toString()+" trainingIndustry "+trainingIndustry;
    }
    public void input(){
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.println(" trainingIndustry: ");
        trainingIndustry=sc.nextLine();
    }
}
