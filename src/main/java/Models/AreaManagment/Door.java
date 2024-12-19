package Models.AreaManagment;

abstract class Door {
    int id;
    int areaId;
    boolean state; // True - opened, False - closed

    public int getId() {
        return id;
    }

    public int getAreaId() {
        return areaId;
    }

    public boolean isState() {
        return state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    // Method to open the door
    void openDoor() {
        setState(true);
        System.out.println("Door is now open.");
    }

    // Method to close the door
    void closeDoor() {
        setState(false);
        System.out.println("Door is now closed.");
    }

}
