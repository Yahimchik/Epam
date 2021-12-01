package by.yahimovich.task01javabasic.controller.impl.sensor;

import by.yahimovich.task01javabasic.controller.Command;
import by.yahimovich.task01javabasic.entity.Data;
import by.yahimovich.task01javabasic.service.SensorService;

import java.util.List;

public class FireSensor implements Command {
    @Override
    public double exec(Data newData) {
        return 0;
    }

    @Override
    public List<Double> execution(Data newData) {
        return null;
    }

    @Override
    public String execute(Data newData) {
        SensorService service = new SensorService();
        return service.fireSensor(newData.getData(0));
    }
}
