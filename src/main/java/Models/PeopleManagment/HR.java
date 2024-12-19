package Models.PeopleManagment;

abstract class HR extends Staff{
    public HR(int id, String firstName, String lastName, String address, int phone, String email) {
        super(id, firstName, lastName, address, phone, email);
    }

    void manageSTEmployee() {

    }
    void manageMTEmployee() {

    }
}
