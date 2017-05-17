import by.gsu.epamlab.beans.NumLen;
import by.gsu.epamlab.comparators.DescendingNumberComparator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class TreeSetRunner2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader(Constants.FILE_NAME))){
            NavigableSet<NumLen> sortedSetNumLen = new TreeSet<>();
            List<Integer> array = ArrayCreator.getE();
 //           int[] array = ArrayCreator.getE();
            long start = System.currentTimeMillis();
            for (int length: array) {
                NumLen numLen = new NumLen(length);
                NumLen floorNumLen = sortedSetNumLen.floor(numLen);
                if(floorNumLen == null || floorNumLen.getLength() != numLen.getLength()){
                    sortedSetNumLen.add(numLen);
                }else {
                    floorNumLen.incrementNumber();
                }
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
            List<NumLen> list = new ArrayList<>(sortedSetNumLen);
            Collections.sort(list, new DescendingNumberComparator());



        } catch (FileNotFoundException e) {
            System.err.println(Constants.FILE_NOT_FOUND);
        }
    }

    private static <E> void printList(List<E> list){
        for (E element: list) {
            System.out.println(element);
        }
    }
    private static int getNumlenLength(String line){
        String[] coordinates =  line.split(Constants.COORDINATES_REGEX);
        double coordinateStartX = Double.parseDouble(coordinates[Constants.COORDINATE_START_X_INDEX]);
        double coordinateStartY = Double.parseDouble(coordinates[Constants.COORDINATE_START_Y_INDEX]);
        double coordinateEndX = Double.parseDouble(coordinates[Constants.COORDINATE_END_X_INDEX]);
        double coordinateEndY = Double.parseDouble(coordinates[Constants.COORDINATE_END_Y_INDEX]);
        int length = (int)Math.round(Math.sqrt(squareOfDifference(coordinateStartX, coordinateEndX) + squareOfDifference(coordinateStartY, coordinateEndY)));
        return length;
    }

    private static double squareOfDifference(double firstCoordinate, double secondCoordinate) {
        return (firstCoordinate - secondCoordinate) * (firstCoordinate - secondCoordinate);
    }
}

