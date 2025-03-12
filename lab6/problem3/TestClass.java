package lab6.problem3;

import java.util.*;

public class TestClass{
    public static void main(String[] args) {
        // a. Create an ArrayList<Marketing> type
        List<Marketing> marketingList = new ArrayList<>();
        
        // b. Add minimum of five objects into the ArrayList
        marketingList.add(new Marketing("Alice", "Laptop", 1500.0));
        marketingList.add(new Marketing("Bob", "Phone", 800.0));
        marketingList.add(new Marketing("Charlie", "Tablet", 1200.0));
        marketingList.add(new Marketing("David", "Monitor", 900.0));
        marketingList.add(new Marketing("Eve", "Keyboard", 500.0));
        
        // c. Delete an object from Marketing by passing instance object
        marketingList.remove(new Marketing("Eve", "Keyboard", 500.0));

        
        
        // d. Print the size of the list
        System.out.println("Size of the marketing list: " + marketingList.size());
        
        // e. Retrieve a Marketing object by its position (get())
        System.out.println("Marketing object at index 2: " + marketingList.get(2));
        
        // f. Update the details of a Marketing object by passing its position (set())
        marketingList.set(1, new Marketing("Bob", "Smartphone", 950.0));
        
        // g. Override the equals() method inside Marketing.java
        // This should be done inside the Marketing class
        
        // h. Sort the list in natural order for the field salesamount using comparator
        marketingList.sort(Comparator.comparingDouble(Marketing::getSalesamount));
        System.out.println("Sorted list by sales amount:");
        marketingList.forEach(System.out::println);
        
        // i. Retrieve employees with sales amount > 1000, then sort by name
        List<Marketing> filteredList = listMoreThan1000(marketingList);
        filteredList.sort(Comparator.comparing(Marketing::getEmployeename));
        
        System.out.println("Employees with sales > $1000 sorted by name:");
        filteredList.forEach(System.out::println);
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing m : list) {
            if (m.getSalesamount() > 1000) {
                result.add(m);
            }
        }
        return result;
    }
}