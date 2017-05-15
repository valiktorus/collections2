package by.gsu.epamlab.factory;

import by.gsu.epamlab.beans.Interval;

public class IntervalFactory {
    public static final int COORDINATE_START_X_INDEX = 1;
    public static final int COORDINATE_START_Y_INDEX = 2;
    public static final int COORDINATE_END_X_INDEX = 3;
    public static final int COORDINATE_END_Y_INDEX = 4;

    private IntervalFactory() {
    }

    public static Interval getInterval(String[] line) {
        double coordinateStartX = Double.parseDouble(line[COORDINATE_START_X_INDEX]);
        double coordinateStartY = Double.parseDouble(line[COORDINATE_START_Y_INDEX]);
        double coordinateEndX = Double.parseDouble(line[COORDINATE_END_X_INDEX]);
        double coordinateEndY = Double.parseDouble(line[COORDINATE_END_Y_INDEX]);
        return new Interval(coordinateStartX, coordinateStartY, coordinateEndX, coordinateEndY);
    }
}
