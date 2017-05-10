package by.gsu.epamlab;

public class Interval {
    private double coordinateStartX;
    private double coordinateStartY;
    private double coordinateEndX;
    private double coordinateEndY;

    public Interval(double coordinateStartX, double coordinateStartY, double coordinateEndX, double coordinateEndY) {
        this.coordinateStartX = coordinateStartX;
        this.coordinateStartY = coordinateStartY;
        this.coordinateEndX = coordinateEndX;
        this.coordinateEndY = coordinateEndY;
    }

    public int getLength(){
        return (int) Math.sqrt(squareOfDifference(coordinateStartX, coordinateEndX) + squareOfDifference(coordinateStartY, coordinateEndY));
    }

    private static double squareOfDifference(double firstCoordinate, double secondCoordinate) {
        return (firstCoordinate - secondCoordinate) * (firstCoordinate - secondCoordinate);
    }

}
