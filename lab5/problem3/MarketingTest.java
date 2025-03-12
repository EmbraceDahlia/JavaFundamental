package lab5.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarketingTest {
    public static void main(String[] args) {
        ArrayList<Marketing> marketing = new ArrayList<>();
        Marketing marketing1 = new Marketing("Gideon", "Fuel", 1000);
        marketing.add(marketing1);
        marketing.add(new Marketing("Dahlia", "Water", 5500));
        marketing.add(new Marketing("Naome", "Soda", 500));
        marketing.add(new Marketing("Seleman", "Tyres", 8000));
        marketing.add(new Marketing("Ruqaiya", "Sugar", 700));
        System.out.println("Marketing Team");
        System.out.println(marketing);
        System.out.println("Current size: " + marketing.size());

        System.out.println("\nRemoving a member");
        marketing.remove(marketing1);
        System.out.println("New size: " + marketing.size() + "\n");

        Marketing marketing2 = marketing.get(0);
        System.out.println("First marketing team employee -> " + marketing2);
        marketing.set(3, new Marketing("Lucy", "Sugar", 5000000));

        System.out.println("\nSorting....");
        Collections.sort(marketing, new AmountComparator());
        System.out.println(marketing);
        List<Marketing> moreThan1000 = listMoreThan1000(marketing);
        System.out.println("More than 1000\n" + moreThan1000);
        Collections.sort(moreThan1000, new NameComparator());
        System.out.println("Sorting....");
        System.out.println(moreThan1000);

    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        if (list == null || list.size() == 0)
            throw new IllegalArgumentException("Invalid list input");
        ArrayList<Marketing> moreThan1000 = new ArrayList<>();
        for (Marketing mk : list) {
            if (mk.getSalesAmount() > 1000) {
                moreThan1000.add(mk);
            }
        }
        return moreThan1000;
    }
}
