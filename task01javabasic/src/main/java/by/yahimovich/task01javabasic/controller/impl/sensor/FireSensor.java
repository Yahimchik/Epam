package by.yahimovich.task01javabasic.controller.impl.sensor;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.service.SensorService;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Command
 */

public class FireSensor implements Command {

    private final SensorService service;
    private final double temperature;

    public FireSensor(SensorService service, double temperature) {
        this.service = service;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        System.out.print(service.fireSensor(temperature));
    }
}
