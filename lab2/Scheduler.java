package lab2;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 * Requirements
 * 1. Develop a Java application
 * 2. Helps a global teams to schedule meetings across different time zones
 * Application should allow users to create an event by specifying a date and time
 * Users should also view the event in different time zone
 * Calculate the days util the event
 * Nicely show the date and time display
 *
 *
 *
 * More requiremnts
 * Part A
 * Create an event to input user details and print the requested details
 * a Allow users to inoput the event name, date, time for a new event
 *b Display the day of the week (E.gSunday Monday) for the event date and check if its in a leap year
 * c calculate and display the number of days from the current date to the event date
 *
 *
 * Part B
 * Write a function to formart Event details
 * Nicely format and display the event date and time including the default system time zone
 * E.G Sunday , October 20 2024 @ 10:30[America/Chicago]
 *
 * Part c
 * Covert the events date and time from the systems default time zone to any other specified time zone entered by the user
 *
 * Sample time zones
 * America/Panama
 * America/Chicago
 * America/Indiana/Indianapolis
 * America/Santiago
 * America/Phoeni
 *
 * */

/**Steps
 * 1. Create a java Event class
 * 2. create properties like the eventname, date, time
 * 3. Declare a scanner and use it to  intput the events name date and time display things on the user console
 * 4.Write a function create event that handles that logic
 * 5.Implement logic for sisplaying the day if the week
 * 6.check if the event date is a leap yer or not
 * 7.Write logic to calculate and display the number if days from the current date to the event date
 *
 * 8.create a function format to format event details
 *9. They should be in the format E.G Sunday , October 20 2024 @ 10:30[America/Chicago]
 * 10.Write logic to convert the events date and time from systems default time zone to anyother time zone examples given bellow
 *
 *
 * */



public class Scheduler {
    //Problem 3
    Date date;
    int year;
    int month;
    int hour;
    int minute;
    int dayOfMonth;

//    String time;
    String eventName;


    public void create_event(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter event name:");
        eventName = scanner.nextLine();

        System.out.println("Enter Year e.g., 2025:");
        year = scanner.nextInt();

        System.out.println("Enter month (1-12):");
        month = scanner.nextInt();

        System.out.println("Enter the day of month: ");
        dayOfMonth = scanner.nextInt();

        System.out.print("Enter hour (0-23): ");
        hour = scanner.nextInt();

        System.out.print("Enter minute (0-59): ");
        minute= scanner.nextInt();

        scanner.nextLine();

        // Get user's time zone input
        System.out.print("Enter a time zone (e.g., America/New_York, Europe/London, Asia/Kolkata): ");
        String userTimeZone = scanner.nextLine();

        LocalDateTime eventDateTime = LocalDateTime.of(year,month,dayOfMonth, hour, minute);
        // Get the ZoneId from the user's input
        ZoneId zoneId = ZoneId.of(userTimeZone);

        ZonedDateTime eventZonedDateTime = eventDateTime.atZone(zoneId);

        // Define custom format
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy hh:mm a z");

        System.out.printf("Event %s date and time in " + userTimeZone + " timezone: " + localDateAsString(eventZonedDateTime), eventName);



//
//        System.out.println("Enter time :");
//        time = scanner.nextLine();
//        System.out.printf("Event will be at %s :",time );

//        System.out.printf("Your %s  event has been scheduled and is due to take place on %s  at %s thank you %n", eventName, date, time);
//        // Consume the newline left by nextInt()
////        System.out.printf("Would you like to display event in another time zone %s", timeZone);
//         System.out.printf("Event name : %s %n Date: %s %n time: %s %n",eventName,date,time);
//
//        System.out.print("Enter a time zone (e.g., America/New_York, Europe/London, Asia/Kolkata): ");

    }

    public static final String DATE_PATTERN = "MM/dd/yyyy z";

    public static String localDateAsString(ZonedDateTime date) {  //pattern: "MM/dd/yyyy"
        return date.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
    }

//    public String  view_event_in_another_time_zone(){
//        //view in another time zones
//        return String.format("Event name : %s %n Date: %s %n time: %s %n",eventName,date,time);
//
//    }

     /* if(check_if_event_date_in_past(local_date)) {
        System.out.println("The event date should not be in the past! ");

        System.out.println("Re Enter event date in the format d/M/YYY | d-M-YYY | d M YYY :");
        date = scanner.nextLine();
    }

    public boolean check_if_event_date_in_past( LocalDate event_date){
        LocalDate currentDate = LocalDate.now();

        if(currentDate.isAfter(event_date)){
            return true;
        }
        return false;
    }
*/

}





