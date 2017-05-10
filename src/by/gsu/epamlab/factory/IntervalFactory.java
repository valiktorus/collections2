package by.gsu.epamlab.factory;

import by.gsu.epamlab.Interval;

public class IntervalFactory {

    private IntervalFactory() {
    }

    public static Interval getInterval(String[] line) {
        double coordinateStartX = Double.parseDouble(line[1]);
        double coordinateStartY = Double.parseDouble(line[2]);
        double coordinateEndX = Double.parseDouble(line[3]);
        double coordinateEndY = Double.parseDouble(line[4]);
        return new Interval(coordinateStartX, coordinateStartY, coordinateEndX, coordinateEndY);
    }
}
