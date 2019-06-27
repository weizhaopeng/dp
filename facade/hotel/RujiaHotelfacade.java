package facade.hotel;

import facade.department.Department;
import facade.department.FinanceManagementDepartment;
import facade.department.RoomManagementDepartment;

public class RujiaHotelfacade implements Hotel {
    private Department roomManagement = null, financeManagement = null;

    public RujiaHotelfacade() {
        this.roomManagement = new RoomManagementDepartment(200);
        this.financeManagement = new FinanceManagementDepartment(0);
    }

    @Override
    public boolean orderRoom() {
        return (this.roomManagement.agreeOrder() && this.financeManagement.agreeOrder());
    }

    @Override
    public boolean cancelRoom() {
        return true;
    }
}
