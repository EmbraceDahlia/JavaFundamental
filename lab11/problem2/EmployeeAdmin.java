package lab11.problem2;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeAdmin {

    /**

     Your method prepareReport should return a list of all Employees in the input table
     whose social security number is in the input list socSecNums and whose salary is greater than $80,000.
     In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
     */
    public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
        List<Employee> list=new ArrayList<>();
        table.forEach((k,v)->{
            if(socSecNums.contains(v.getSsn()) && v.getSalary()>80000)
                list.add(v);
        });
        Collections.sort(list,(c1,c2)->
            c1.getSsn().compareTo(c2.getSsn())
        );
        return list;
    }

}
