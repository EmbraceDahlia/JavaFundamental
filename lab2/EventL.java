package lab2;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EventL {
    private static final String dateTimeFormat = "MM/dd/yyyy hh:mm a";
    private static final String dateFormat = "MM/dd/yyyy";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the event name : ");
        String eventName = scanner.nextLine();
        System.out.println("Enter the event date in the format MM/dd/yyyy : ");
        String eventDateStr = scanner.nextLine();
        System.out.println("Enter the event time in the format hh:mm tt :");
        String eventTimeStr = scanner.nextLine();

        LocalDateTime eventDateTime = LocalDateTime.parse(eventDateStr + " " + eventTimeStr, DateTimeFormatter.ofPattern(dateTimeFormat));
        EventOld event = new EventDahlia(eventName,eventDateTime);

        System.out.println("Event Name: " + event.getName());
        System.out.println("Event Day: " + eventDateTime.getDayOfWeek());

        LocalDate eventDate = LocalDate.parse(eventDateStr, DateTimeFormatter.ofPattern(dateFormat));
        System.out.println(eventDate.isLeapYear()?"It is a leap year.":"It isn't a leap year.");
        System.out.println("Exact Event Date Time: "+ event.formatEvent());

        Period p = Period.between(LocalDate.now(),eventDate);
        System.out.println("Remaining Days: "+p.getDays());

        System.out.println("Enter the time zone you want to see, e.g America/Chicago");
        String userTimeZone = scanner.nextLine();
        System.out.println();

    }
}