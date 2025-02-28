package lab2.problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TargetHeartRateCalculatorApp {
    
    public static final String DATE_PATTERN = "yyyy-MM-dd";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = s.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = s.nextLine();
        LocalDate dateOfBirth = null;
        do {
            System.out.println("Please enter your birth date in the format (yyyy-MM-dd). E.g. 1998-01-08");
            String dobString = s.nextLine();
            try {
                dateOfBirth = LocalDate.parse(dobString, DateTimeFormatter.ofPattern(DATE_PATTERN));
            } catch (Exception e) {
                System.out.println("Incorrect Date Format!");
            }
        } while (dateOfBirth == null);
        HeartRates heartRates = new HeartRates(firstName, lastName, dateOfBirth);
        heartRates.calculateTargetHeartRate();
        System.out.println(heartRates.toString());
        s.close();
    }
}
