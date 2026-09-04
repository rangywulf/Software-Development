public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty() {
    }

    public Faculty(String officeHours, String rank) {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // return officeHours
    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    // return rank
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override 
    public String toString() {
        return "Faculty: " + name;
    }
}
