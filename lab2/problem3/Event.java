package lab2.problem3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Event {
    private String eventName;
    private LocalDate date;
    private LocalTime time;
    private ZonedDateTime dateTimeWithZone;

    private final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter
            .ofPattern("EEEE, MMMM d yyyy @ HH:mm'['VV']'");

    private final String[] TIME_ZONES = {
            "America/Chicago", "America/Indiana/Indianapolis",
            "America/Santiago", "America/Phoenix"
    };

    public void setEventName(String eventName) {
        this.eventName = eventName.trim();
    }

    public String getEventName() {
        return this.eventName;
    }

    public void setDate(String dateInput) {
        try {
            this.date = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("d/M/yyyy"));
        } catch (Exception e) {
            System.out.println("Invalid date format! Use d/M/yyyy.");
        }
    }

    public void setTime(String timeInput) {
        try {
            this.time = LocalTime.parse(timeInput, DateTimeFormatter.ofPattern("HH:mm"));
        } catch (Exception e) {
            System.out.println("Invalid time format! Use HH:mm (24-hour format).");
        }
    }

    public void createEvent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter event name: ");
        setEventName(scanner.nextLine());

        System.out.print("Enter event date (d/M/yyyy): ");
        setDate(scanner.nextLine());

        System.out.print("Enter time (HH:mm, 24-hour format): ");
        setTime(scanner.nextLine());

        dateTimeWithZone = ZonedDateTime.of(date, time, ZoneId.systemDefault());

        // Display event details
        showEventDetails();
        checkLeapYear();
        System.out.printf("Days until event: %d days%n%n", daysUntilEvent());

        // Option to change timezone
        System.out.println("Would you like to view the event in a different time zone?");
        System.out.println("1: Yes");
        System.out.println("2: No");

        if (scanner.nextLine().equals("1")) {
            selectTimeZone(scanner);
        }

        scanner.close();
    }

    private void showEventDetails() {
        System.out.println(this.getEventName());
        System.out.printf("%s\n", this.dateTimeWithZone.format(DATE_FORMATTER));
    }

    private void checkLeapYear() {
        System.out.println(date.isLeapYear()
                ? "This event is in a Leap Year."
                : "This event is NOT in a Leap Year.");
    }

    private int daysUntilEvent() {
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), date);
    }

    private void selectTimeZone(Scanner scanner) {
        System.out.println("\nSelect a time zone:");
        System.out.println("0: America/Chicago");
        System.out.println("1: America/Indiana/Indianapolis");
        System.out.println("2: America/Santiago");
        System.out.println("3: America/Phoenix");

        System.out.print("\nEnter selection (0-3): ");
        int selectedIndex;

        try {
            selectedIndex = Integer.parseInt(scanner.nextLine());
            if (selectedIndex < 0 || selectedIndex >= TIME_ZONES.length) {
                throw new Exception();
            }
            // setTimeZone(TIME_ZONES[selectedIndex]);
            ZoneId newZone = ZoneId.of(TIME_ZONES[selectedIndex]);
            this.dateTimeWithZone = dateTimeWithZone.withZoneSameInstant(newZone);
            showEventDetails();
        } catch (Exception e) {
            System.out.println("Invalid selection! Keeping the current timezone.");
        }
    }

}
