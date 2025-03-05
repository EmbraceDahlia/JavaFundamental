package lab4.problem3;

import java.time.LocalDateTime;

public class SensorTest {

    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[5];
        sensors[0] = new TemperatureSensor("The lounge", LocalDateTime.now(), 25);
        sensors[1] = new LightSensor("The lounge", LocalDateTime.now(), 60);
        sensors[2] = new SoundSensor("The lounge", LocalDateTime.now(), 20);
        sensors[3] = new TemperatureSensor("Room 11", LocalDateTime.now(), 32);
        sensors[4] = new LightSensor("Library", LocalDateTime.now(), 30);

        for (Sensor sensor : sensors) {
            System.out.println(sensor.toString() + "\n");
        }
    }
}
