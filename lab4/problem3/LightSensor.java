package lab4.problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    private final String SENSOR_TYPE = "Light";
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
    private String location;
    private LocalDateTime lastUpdated = LocalDateTime.now();
    private double lightLevel;

    LightSensor(String location, LocalDateTime lastUpdated, int lightLevel) {
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.lightLevel = lightLevel;

    }

    @Override
    public String getSensorType() {
        return SENSOR_TYPE;
    }

    @Override
    public double getReading() {
        return lightLevel;
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
        if (lightLevel < 100) {
            return "Turn on light";
        }
        return "Light is sufficient";
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