package lab6.problem2;

import java.util.List;
abstract public class Statistics implements EmployeeData{
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */

	public static double computeSumOfSalaries(List<EmployeeData> aList) {

		//implement
		//compute sum of all salaries of people in aList and 
		//loop through the alist 
		if(aList == null){
			return 0.0;
		}

		double sum = 0.0;
		
		//loop through the combined list
        for (EmployeeData employee : aList) {
			if(employee !=null){
				sum += employee.getSalary();
			}
            
        }
        return sum;


		
	

		
	}
}
