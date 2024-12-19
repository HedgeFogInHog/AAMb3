package Models.PeopleManagment;

abstract class Person {
    int id;
    String firstName;
    String lastName;

    // Constructor
    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}