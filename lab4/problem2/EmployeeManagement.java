package lab4.problem2;

import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Professor p1 = new Professor("Renuka", 5000, 2001, 1, 1, 1);
        Professor p2 = new Professor("Elina", 4000, 2002, 2, 2, 2);
        Professor p3 = new Professor("Susan", 3000, 2003, 3, 3, 3);
        Secretary s1 = new Secretary("Girma", 2000, 2005, 5, 5, 2);
        Secretary s2 = new Secretary("Melissa", 2500, 2006, 6, 6, 2);
        DeptEmployee[] employees = {p1, p2, p3, s1, s2};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to see the total salary of your department? Please enter 'Y' to check it out:");
        String ans = scanner.next();
        if(ans.equalsIgnoreCase("y")) {
            double totalSalary = 0;
            int totalEmployee = 0;

            for (DeptEmployee e : employees) {
                totalSalary += e.computeSalary();
                totalEmployee++;
            }

            double avgSalary = totalSalary / totalEmployee;

            System.out.printf("Department total salary: %.2f", totalSalary);
            System.out.println();
            System.out.printf("Average salary: %.2f", avgSalary);
        }
    }
}
