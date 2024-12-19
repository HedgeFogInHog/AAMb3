package Models.PeopleManagment;

abstract class ScienceTeamMember extends Staff{
    int boundAreaId;
    String profession;

    public ScienceTeamMember(int id, String firstName, String lastName, String address, int phone, String email, int boundAreaId, String profession) {
        super(id, firstName, lastName, address, phone, email);
        this.boundAreaId = boundAreaId;
        this.profession = profession;
    }

    void manageBoundAreaDoor() {

    }
}
