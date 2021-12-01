package by.yahimovich.task01javabasic.service;

public class SensorService {
    public String fireSensor(double temperature) {
        String str;
        if (temperature > 60) {
            str = "Fire hazardous situation!";
        } else {
            str = "All is good!";
        }
        return str + "\nTemperature is: " + temperature + " °С\n";
    }
}
