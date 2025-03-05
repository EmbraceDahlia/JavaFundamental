package lab4.problem4;

//Driver class
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new CommissionEmployee("Gideon", "Bamuleseyo", "124456", 100, 0.5);
        Employee emp2 = new HourlyEmployee("Naume", "Kizza", "124456", 500, 40);
        Employee emp3 = new SalariedEmployee("Dahlia", "Dahlia ", "124456", 4000000);
        Employee emp4 = new BasePlusCommissionEmployee("Saka", "Bukayo", "124456", 200, 0.5, 5000000);
        Employee emp5 = new CommissionEmployee("Parte", "Thomas", "124456", 400, 0.5);
        Employee[] employees = new Employee[] { emp1, emp2, emp3, emp4, emp5 };

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        System.out.println("\nEmployee with Max Salary");
        try {
            System.out.println(findMaxSalary(employees).toString());
        } catch (Exception e) {
            System.out.println("Can not find employee with max salary, please check the input");
        }
    }

    public static Employee findMaxSalary(Employee[] col) {
        if (col == null || col.length == 0) {
            throw new IllegalArgumentException("Employee array must not be null or empty");
        }

        Employee maxSalaryEmployee = null;
        double maxSalary = 0;
        for (int i = 0; i < col.length; i++) {
            if (col[i] != null) {
                double salary = col[i].getPayment();
                if (salary > maxSalary) {
                    maxSalary = salary;
                    maxSalaryEmployee = col[i];
                }
            }

        }
        return maxSalaryEmployee;
    }
}
