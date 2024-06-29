package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {

    private List<Sensor> sensorList = new ArrayList<>();
    private List<Integer> readingsList = new ArrayList<>();

    @Override
    public boolean isOn() {
        return sensorList.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        sensorList.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        sensorList.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if (!isOn() || sensorList.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int average = (int) Math.round(sensorList.stream().mapToInt(Sensor::read).average().orElse(0.0));
        readingsList.add(average);
        return average;
    }

    public void addSensor(Sensor toAdd) {
        sensorList.add(toAdd);
    }

    public List<Integer> readings() {
        return readingsList;

    }
}
