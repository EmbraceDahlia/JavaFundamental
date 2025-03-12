package lab5.problem2;

import java.util.List;

public class Statistics {
    /**
     * Polymorphically computes and returns the sum
     * of all the salaries of all the staff/teachers in the list.
     */
    public static double computeSumOfSalaries(List<EmployeeData> aList) {
        if(aList == null) return 0;
        double totalSalary = 0;
        for (EmployeeData d : aList) {
            if(d!=null)
                totalSalary += d.getSalary();
        }
        return totalSalary;
    }
}
