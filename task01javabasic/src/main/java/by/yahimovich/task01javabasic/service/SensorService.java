package by.yahimovich.task01javabasic.service;

/**
 * @author Egor Yahimovich
 * @version 1.0
 */

public class SensorService {

    /**
     * This method modeling fire Sensor controller
     *
     * @param temperature - Temperature in room
     * @return answer and temperature at the moment
     */

    public String fireSensor(double temperature) {
        String str;
        if (temperature > 60) {
            str = "Fire hazardous situation!";
        } else if (temperature == 60) {
            str = "Critical value!";
        } else {
            str = "All is good!";
        }
        return str + "\nTemperature is: " + temperature + " °С\n";
    }
}
