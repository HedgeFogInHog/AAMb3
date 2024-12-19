package Models.PeopleManagment;

abstract class Staff extends Person {
    String address;
    int phone;
    String email;

    public Staff(int id, String firstName, String lastName, String address, int phone, String email) {
        super(id, firstName, lastName);
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}

