package Models.PeopleManagment;

import Models.Person;

abstract class Visitor extends Person {
    String visitDate;

    public Visitor(int id, String firstName, String lastName, String visitDate) {
        super(id, firstName, lastName);
        this.visitDate = visitDate;
    }
}