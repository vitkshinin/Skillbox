public class TopManager implements Employee {

    public static int FIX_SALARY = 1500000;
    public Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    public double getMonthSalary() {
        return FIX_SALARY + company.getIncome() > 10000000 ? (int) (FIX_SALARY * 1.5) : 0;
    }
}