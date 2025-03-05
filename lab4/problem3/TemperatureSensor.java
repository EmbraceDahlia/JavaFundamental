package lab4.problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor {
    private final String SENSOR_TYPE = "Temperature";
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
    private String location;
    private LocalDateTime lastUpdated = LocalDateTime.now();
    private double temperature;

    TemperatureSensor(String location, LocalDateTime lastUpdated, double temperature) {
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.temperature = temperature;
    }

    @Override
    public String getSensorType() {
        return SENSOR_TYPE;
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    @Override
    public String performAction() {
        if (temperature > 30) {
            return "Turn on AC";
        } else if (temperature < 18) {
            return "Turn on the heater";
        } else {
            return "Temperature is in normal range";
        }

    }

    @Override
    public String toString() {
        return "Sensor Type: " + getSensorType() + "\n" +
                "Reading: " + getReading() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Last Updated: " + getLastUpdated().format(formatter) + "\n" +
                "Action: " + performAction();
    }
}
