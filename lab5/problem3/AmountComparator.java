package lab5.problem3;

import java.util.Comparator;

public class AmountComparator implements Comparator<Marketing> {

    @Override
    public int compare(Marketing o1, Marketing o2) {
        String employeeName1 = o1.getEmployeeName();
        String employeeName2 = o2.getEmployeeName();
        String productName1 = o1.getProductName();
        String productName2 = o2.getProductName();
        double salesAmount1 = o1.getSalesAmount();
        double salesAmount2 = o2.getSalesAmount();
        if (Double.compare(salesAmount1, salesAmount2) != 0)
            return Double.compare(salesAmount1, salesAmount2);
        if (employeeName1.compareTo(employeeName2) != 0)
            return employeeName1.compareTo(employeeName2);
        return productName1.compareTo(productName2);
    }

}
