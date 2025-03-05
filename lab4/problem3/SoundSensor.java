package lab4.problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class SoundSensor implements Sensor {
    private final String SENSOR_TYPE = "Sound";
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
    private String location;
    private LocalDateTime lastUpdated = LocalDateTime.now();
    private int soundLevel;

    SoundSensor(String location, LocalDateTime lastUpdated, int soundLevel) {
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.soundLevel = soundLevel;
    }

    @Override
    public String getSensorType() {
        return SENSOR_TYPE;
    }

    @Override
    public double getReading() {
        return soundLevel;
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
        if (soundLevel > 70) {
            return "Turn on noise cancellation";
        }
        return "Sound is within normal range";
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