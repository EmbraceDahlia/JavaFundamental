package lab2.problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRates {
    private final int RESTING_HEART_RATE = 70;
    private final double LOWER_BOUNDARY = 0.5;
    private final double UPPER_BOUNDARY = 0.85;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    private static final String DATE_PATTERN = "yyyy-MM-dd";

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAgeInYears() {
        LocalDate today = LocalDate.now();
        Period p = Period.between(this.dateOfBirth, today);
        return p.getYears();
    }

    public int getMaximumHeartRate() {
        return 220 - getAgeInYears();
    }

    public void calculateTargetHeartRate() {
        int averageHeartRate = getMaximumHeartRate() - RESTING_HEART_RATE;
        double LBTHR = (averageHeartRate * LOWER_BOUNDARY) + RESTING_HEART_RATE;
        double UBTHR = (averageHeartRate * UPPER_BOUNDARY) + RESTING_HEART_RATE;
        System.out.println("The target heart rate range is between " + LBTHR + " and " + UBTHR + ".");
    }

    public String toString() {
        int age = this.getAgeInYears();
        int MHR = getMaximumHeartRate();
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + " year(s) \nDate of Birth: " + dateOfBirth.format(DateTimeFormatter.ofPattern(DATE_PATTERN)) + "\nMaximum Heart Rate (MHR): "+MHR;
    }
}
