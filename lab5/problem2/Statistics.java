package lab5.problem2;

import java.util.List;

public class Statistics {
    /**
     * Polymorphically computes and returns the sum
     * of all the salaries of all the staff/teachers in the list.
     */
    public static double computeSumOfSalaries(List<EmployeeData> aList) {
        double totalSalary = 0;
        for (EmployeeData d : aList) {
            totalSalary += d.getSalary();
        }
        return totalSalary;
    }
}
