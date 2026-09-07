public class TestStudentEmployee {
    public static void main(String[] args) {

        // Create date hired
        MyDate dateHired = new MyDate(2020, 8, 15);

        // Create Person
        Person person = new Person("Jess", "123 Main Street", "555-555-1234", "test@test.com");

        // Create Student
        Student student = new Student("Bob", "123 Main Street", "555-543-4321", "bob@test.com", Student.SOPHOMORE);

        // Create Employee
        Employee employee = new Employee("Bill", "123 Manilla", "555-432-0987", "bill@test.com","Computer Science Building 123", 120000, dateHired);

        // Create Staff
        Staff staff = new Staff("Sophie", "987 Main Street", "987-678-5678", "Sophie@test.com", "Engineering Building", 200000, dateHired,"Director");

        // Create Faculty
        Faculty faculty = new Faculty("Penny", "349 Main street", "545-698-4356", "Penny@test.com", "Engineering", 120000, dateHired,"10 to 2", "Tenured");

        // Print
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(staff);
        System.out.println(faculty);
    }
    
}
