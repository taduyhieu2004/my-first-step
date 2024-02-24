package quanligiaovien;

public class Teacher extends Person {
    private int baseSalary;
    private int bonusSalary;
    private int minusSalary;

    public int getMinusSalary() {
        return minusSalary;
    }

    public void setMinusSalary(int minusSalary) {
        this.minusSalary = minusSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }
}
