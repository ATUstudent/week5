package ie.atu;

public class person {
    String firstName;
    String lastName;
    int age;

    public person(String firstname, String lastName, int age) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.age = age;
    }


    public void displayInfo() {
        System.out.println("name: " + firstName + "" + lastName + ", Age: " + age);
    }

}
