package quanlisinhvien2;

public class Student {
    private String id;
    private String name;
    private double theoreticalPoint;
    private double practicePoints;

    public Student() {
    }

    public double GPA() {
        return (theoreticalPoint + practicePoints) / 2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTheoreticalPoint() {
        return theoreticalPoint;
    }

    public void setTheoreticalPoint(double theoreticalPoint) {
        this.theoreticalPoint = theoreticalPoint;
    }

    public double getPracticePoints() {
        return practicePoints;
    }

    public void setPracticePoints(double practicePoints) {
        this.practicePoints = practicePoints;
    }

    public String toString() {
        return String.format("%10s%20s%20f%20f%10f", id, name, theoreticalPoint, practicePoints, GPA());

    }
}
