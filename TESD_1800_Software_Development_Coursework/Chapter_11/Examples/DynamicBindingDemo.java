public package TESD_1800_Software_Development_Coursework.Chapter_11.Examples;

class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent()); // causes the toString method defined in the Studen class to be invoked.
        m(new Student()); // causes the toString method in the Student class to be invoked.
        m(new Person()); // causes the toString method in the Person class to be invoked.
        m(new Object()); // causes the toString method in the Object class to be invoked.
    }

    public static void m(Object x) { // takes a parameter of the Object type.
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student {
}

class Student extends Person {
    @Override
    public String toString() {
        return "Student";
    }
}

class Person extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}