package lab5.problem3;

import java.util.Comparator;

public class MarketingComparator implements Comparator<Marketing> {

    @Override
    public int compare(Marketing m1, Marketing m2) {
        double salesAmount1 = m1.getSalesAmount();
        double salesAmount2 = m2.getSalesAmount();
        return Double.compare(salesAmount1, salesAmount2);
    }
}
