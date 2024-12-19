package Models.PeopleManagment;

abstract class MaintenanceTeamMember extends Staff{
    int boundAreaId;

    public MaintenanceTeamMember(int id, String firstName, String lastName, String address, int phone, String email, int boundAreaId) {
        super(id, firstName, lastName, address, phone, email);
        this.boundAreaId = boundAreaId;
    }

    void manageBoundAreaDoor() {

    }
}