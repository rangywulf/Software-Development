public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee() {
    }

    public Employee(String name, String address, String phone, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // return office
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    // return salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // return date
    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override 
    public String toString() {
        return "Employee: " + name;
    }
}
