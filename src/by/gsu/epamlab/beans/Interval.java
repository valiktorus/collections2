package by.gsu.epamlab.beans;

public class Interval {
    private final int length;
    private int number;

    public Interval(double coordinateStartX, double coordinateStartY, double coordinateEndX, double coordinateEndY) {
        this(defineLength(coordinateStartX, coordinateStartY, coordinateEndX, coordinateEndY), 1);
    }

    public Interval(int length, int number) {
        this.length = length;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public int getLength() {
        return length;
    }

    public void incrementNumber(){
        number++;
    }
    private static int defineLength(double coordinateStartX, double coordinateStartY, double coordinateEndX, double coordinateEndY){
        return (int)Math.round(Math.sqrt(squareOfDifference(coordinateStartX, coordinateEndX) + squareOfDifference(coordinateStartY, coordinateEndY)));
    }

    private static double squareOfDifference(double firstCoordinate, double secondCoordinate) {
        return (firstCoordinate - secondCoordinate) * (firstCoordinate - secondCoordinate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Interval interval = (Interval) o;

        return length == interval.length;
    }

    @Override
    public int hashCode() {
        return length;
    }

    @Override
    public String toString() {
        return length + ";" + number;
    }
}
