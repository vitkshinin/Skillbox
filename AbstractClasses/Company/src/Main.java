public class Main {
    public static void main(String[] args) {

        Company company = new Company(15000000);
        hireEmployees(company);
        printHighestSalaries(company);
        printLowestSalaries(company);
        fireHalfEmployees(company);
        printHighestSalaries(company);
        printLowestSalaries(company);
    }

    private static void printLowestSalaries(Company company) {
        System.out.println("����� ������ ��������: ");
        for (Employee employee : company.getLowestSalaryStaff(30)) {
            System.out.println(employee.getMonthSalary());
        }
    }

    private static void printHighestSalaries(Company company) {
        System.out.println("����� ������� ��������: ");
        for (Employee employee : company.getTopSalaryStaff(15)) {
            System.out.println(employee.getMonthSalary());
        }
    }

    private static void fireHalfEmployees(Company company) {
        int countEmployees = company.countEmployees();
        for (int i = 0; i < countEmployees / 2; i++) {
            int index = (int) (Math.random() * company.countEmployees());
            Employee loser = company.getEmployees().get(index);
            company.fire(loser);
        }
        System.out.println("������� " + countEmployees / 2 + " �����������");
    }

    private static void hireEmployees(Company company) {
        for (int i = 0; i < 180; i++) {
            Employee operator = new Operator();
            company.hire(operator);
        }
        for (int i = 0; i < 80; i++) {
            Employee manager = new Manager();
            company.hire(manager);
        }
        for (int i = 0; i < 10; i++) {
            Employee topManager = new TopManager();
            company.hire(topManager);
        }
        System.out.println("��������� �����������: " + company.countEmployees());
    }
}
