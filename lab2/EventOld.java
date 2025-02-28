package lab2;

import java.time.*;
import java.time.format.DateTimeFormatter;
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
 * America/Phoenix
 *
 * */

/**Steps
 * 1. Create a java Event class
 * 2. create properties like the eventname, date, time
 * 3. Declare a scanner and use it to  intput the events name date and time display things on the user console
 * 4.Write a function create event that handles that logic
 * 5.Implement logic for displaying the day of the week for the date
 * 6.check if the event date is a leap yer or not
 * 7.Write logic to calculate and display the number of days from the current date to the event date
 *
 * 8.create a function format to format event details
 *9. They should be in the format E.G Sunday , October 20 2024 @ 10:30[America/Chicago]
 * 10.Write logic to convert the events date and time from systems default time zone to anyother time zone examples given bellow
 *
 *
 * */



public class EventOld {

    String eventName;
    String date;
    String time;
    boolean leapYear;
    ZoneId timeZone;
    ZoneId defaultTimeZone ;
    String[] timeZones =  {"America/Chicago", "America/Indiana/Indianapolis", "America/Santiago", "America/Phoenix"};
    private static final String dateTimeFormat = "MM/dd/yyyy hh:mm a";

    public void create_event(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter event name:");
        eventName = scanner.nextLine();
        System.out.println("Enter event date in the format d/M/YYY | d-M-YYY | d M YYYY:");
        date = scanner.nextLine();
        System.out.println("Enter event time (HH:mm) in 24-hour format:");
        time = scanner.nextLine();

        // LocalDateTime eventDateTime = LocalDateTime.parse(date + " " + time, DateTimeFormatter.ofPattern(dateTimeFormat));
        // System.out.println(eventDateTime);




        //logic for displaying the day of the week
        //spliting the userinput date
        String[] dateSplit = date.split("/|-| ");
        int dayOfMonth = Integer.parseInt(dateSplit[0]);
        int month = Integer.parseInt(dateSplit[1]);
        int year = Integer.parseInt(dateSplit[2]);

//        //formatting date
//        final String DATE_PATTERN = "EEEE, MMMM yyyy";
//        LocalDate local_date = LocalDate.of(year,month,dayOfMonth);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
//        String formated_date = this.format_date_to_display_day_of_week(date);
        defaultTimeZone = ZoneId.systemDefault();

        String newDate = this.formatEventDetails(date,time,defaultTimeZone);
        System.out.printf("%nEvent name : %s %nDate: %s %nTime: %s %n",eventName,newDate,time);

        //check if is leap year
        leapYear = this.isLeapYear(date);
        System.out.printf((leapYear == true)?"is leap year? %s":"The %s event will take place in a non leap year %s%n",eventName, year);
        LocalDate local_date = LocalDate.of(year,month,dayOfMonth);

        //check remaining days
        int noOfDays = this.calculate_remaining_days(local_date);
        System.out.println("Days Remaining: " + noOfDays +" days%n");

        int selection = 2;

        System.out.println("Would you like to view event in a different time zone?%n");
        System.out.println("1 : Yes\n");
        System.out.println("2 : No\n");
        selection=Integer.parseInt(scanner.nextLine());



        if(selection == 1){
            System.out.println("Select time zone:%n");
            System.out.println("0: America/Chicago:\n");
            System.out.println("1: America/Indiana/Indianapolis:\n");
            System.out.println("2: America/Santiago: \n");
            System.out.println("3: America/Phoenix: \n");
            String selectedZone = scanner.nextLine();

            
            int selectedTimeZoneIndex = Integer.parseInt(selectedZone); 
            timeZone =ZoneId.of(timeZones[selectedTimeZoneIndex]);
                
            

            String zonedate  = this.formatEventDetails(date,time,timeZone);
            System.out.printf("%nEvent name : %s %nDate: %s %nTime: %s %n",eventName,zonedate,time);

        }

        scanner.close();

    }

    public boolean check_if_event_date_in_past( LocalDate event_date){
        LocalDate currentDate = LocalDate.now();

        if(currentDate.isAfter(event_date)){
            return true;
        }
        return false;
    }

    public  int calculate_remaining_days(LocalDate local_date){

        //calculating the number of days remaining to the event
        int noOfDays = 0;

        LocalDate currentDate = LocalDate.now();

        if(currentDate.isAfter(local_date)){
            System.out.println("The event date should not be in the past ");
        }

        LocalDate tempDate = currentDate;
        while (tempDate.isBefore(local_date)){
            tempDate = tempDate.plusDays(1);
            noOfDays++;
        }
        return noOfDays;
    }


    public  boolean isLeapYear(String date){
        String[] dateSplit = date.split("/|-| ");
        int dayOfMonth = Integer.parseInt(dateSplit[0]);
        int month = Integer.parseInt(dateSplit[1]);
        int year = Integer.parseInt(dateSplit[2]);

        //Checking if the event year is a leap year
        if(year%4 ==0 && year%400 ==0 && year%100!=0){
            leapYear = true;
        }
        leapYear = false;
        return leapYear;

    }

    public String format_date_to_display_day_of_week(String date){
        String[] dateSplit = date.split("/|-| ");
        int dayOfMonth = Integer.parseInt(dateSplit[0]);
        int month = Integer.parseInt(dateSplit[1]);
        int year = Integer.parseInt(dateSplit[2]);

        //formatting date
        final String DATE_PATTERN = "EEEE, MMMM yyyy";
        LocalDate local_date = LocalDate.of(year,month,dayOfMonth);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        return  formatter.format(local_date);
    }

    public String formatEventDetails(String date, String time, ZoneId zone){

        //spliting the userinput date
        String[] dateSplit = date.split("/|-| ");
        int dayOfMonth = Integer.parseInt(dateSplit[0]);
        int month = Integer.parseInt(dateSplit[1]);
        int year = Integer.parseInt(dateSplit[2]);

        //formating time

        // Define the formatter for input time
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        // Parse the time string into LocalTime
        LocalTime localTime = LocalTime.parse(time, timeFormatter);

        final String DATE_PATTERN = "EEEE, MMMM d yyyy @ HH:mm'['VV']'";
        LocalDate local_date = LocalDate.of(year,month,dayOfMonth);

        // Convert to local date-time with system's default time zone
        ZonedDateTime zonedDateTime =  ZonedDateTime.of(local_date, localTime, zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        //        ZonedDateTime.of(localDate, localTime, ZoneId.systemDefault());


        return zonedDateTime.format(formatter);

    }

// 10.Write logic to convert the events date and time from systems default time zone to anyother time zone examples given bellow

   public String  view_event_in_another_time_zone(){
       //view in another time zones
       return String.format("Event name : %s %n Date: %s %n time: %s %n",eventName,date,time);

   }

}



