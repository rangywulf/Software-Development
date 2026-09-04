public class Student extends Person {
    private String status;
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    public Student(String status) {
        if (status.equals(FRESHMAN) ||
            status.equals(SOPHOMORE) ||
            status.equals(JUNIOR) ||
            status.equals(SENIOR)) {
                this.status = status;
        }
    }

    // return status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals(FRESHMAN) ||
            status.equals(SOPHOMORE) ||
            status.equals(JUNIOR) ||
            status.equals(SENIOR)) {
                this.status = status;
        }
    }

    @Override 
    public String toString() {
        return "Student: " + name;
    }
    
}
