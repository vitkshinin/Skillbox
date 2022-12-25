public class Main {
    public static void main(String[] args) {

        Company skillbox = new Company(15000000);
        hireEmployees(skillbox);
        printHighestSalaries(skillbox);
        printLowestSalaries(skillbox);
        fireHalfEmployees(skillbox);
        printHighestSalaries(skillbox);
        printLowestSalaries(skillbox);
    }

    private static void printLowestSalaries(Company skillbox) {
        System.out.println("Самые низкие зарплаты: ");
        for (Employee employee : skillbox.getLowestSalaryStaff(30)) {
            System.out.println(employee.getMonthSalary());
        }
    }

    private static void printHighestSalaries(Company skillbox) {
        System.out.println("Самые высокие зарплаты: ");
        for (Employee employee : skillbox.getTopSalaryStaff(15)) {
            System.out.println(employee.getMonthSalary());
        }
    }

    private static void fireHalfEmployees(Company skillbox) {
        int countEmployees = skillbox.countEmployees();
        for (int i = 0; i < countEmployees / 2; i++) {
            int index = (int) (Math.random() * skillbox.countEmployees());
            Employee loser = skillbox.getEmployees().get(index);
            skillbox.fire(loser);
        }
        System.out.println("Уволено " + countEmployees / 2 + " сотрудников");
    }

    private static void hireEmployees(Company skillbox) {
        for (int i = 0; i < 180; i++) {
            Employee operator = new Operator();
            skillbox.hire(operator);
        }
        for (int i = 0; i < 80; i++) {
            Employee manager = new Manager();
            skillbox.hire(manager);
        }
        for (int i = 0; i < 10; i++) {
            Employee topManager = new TopManager(skillbox);
            skillbox.hire(topManager);
        }
        System.out.println("Добавлено сотрудников: " + skillbox.countEmployees());
    }
}
