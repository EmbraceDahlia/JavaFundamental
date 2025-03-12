package lab5.problem3;

import java.util.*;

public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return employeeName + " " + productName + " " + salesAmount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!this.getClass().equals(obj.getClass())) return false;
        Marketing mObj = (Marketing) obj;
//        return (this.employeeName.equals(mObj.employeeName) && this.productName.equals(mObj.productName) && this.salesAmount==mObj.salesAmount);
        return this.salesAmount == mObj.salesAmount;
    }

    public static void main(String[] args) {
        List<Marketing> mList = new ArrayList<>();
        Marketing m1 = new Marketing("Anna", "Roses", 1000);
        mList.add(m1);
        mList.add(new Marketing("Bobby Kang", "Baby-breath", 2000));
        mList.add(new Marketing("Chanyeol Park", "Roses", 3000));
        mList.add(new Marketing("Kai Kim", "Roses", 4000));
        mList.add(new Marketing("Jennie Kim", "Plants", 5000));

        mList.remove(m1);
        System.out.println("Marketing list size: " + mList.size());
        if (!mList.isEmpty()) {
            Marketing m = mList.get(mList.size() - 1);
            System.out.println(m);
            m.setProductName("New Album J");
            mList.set(mList.size() - 1, m);
        }

        MarketingComparator mc=new MarketingComparator();
        Collections.sort(mList,mc);
        System.out.println(mList);

    }

}
