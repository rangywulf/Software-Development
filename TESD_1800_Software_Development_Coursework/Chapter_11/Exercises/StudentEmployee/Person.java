public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // return name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // return address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // return phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // return email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override 
    public String toString() {
        return "Person: " + name;
    }

}
