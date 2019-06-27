package facade.department;

public class RoomManagementDepartment extends Department{
    private int roomNumber;

    public RoomManagementDepartment(int roomNumberT) {
        this.roomNumber = roomNumberT;
    }

    @Override
    public boolean agreeOrder() {
        return this.roomNumber > 0;
    }
}
