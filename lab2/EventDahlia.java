package lab2;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventDahlia {
    private  String name;
    private  LocalDateTime dateTime;
    private static final String PRETTY_DATE_TIME_PATTERN = "EEEE, MMMM dd, yyyy @ hh:mm '['VV']'";

    public String getName() {
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public EventDahlia(String name, LocalDateTime dateTime){
        this.name = name;
        this.dateTime = dateTime;
    }

    public String formatEvent(){
        return this.dateTime.format(DateTimeFormatter.ofPattern(PRETTY_DATE_TIME_PATTERN));
    }


}