package facade.department;

public class FinanceManagementDepartment extends Department {
    private int customerAccout;

    public FinanceManagementDepartment(int customerAccout) {
        this.customerAccout = customerAccout;
    }

    @Override
    public boolean agreeOrder() {
        return customerAccout > 0;
    }
}
