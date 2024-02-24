package quanlidancu;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private int membersOfFamily;
    private int houseNumber;
    private List<People> people;

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getMembersOfFamily() {
        return membersOfFamily;
    }

    public void setMembersOfFamily(int membersOfFamily) {
        this.membersOfFamily = membersOfFamily;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    public String toString() {
        return "house number:" + houseNumber + " members of family :" + membersOfFamily +" "+ people;
    }


}
