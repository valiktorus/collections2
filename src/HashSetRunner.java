import by.gsu.epamlab.beans.HashSetNumLen;
import by.gsu.epamlab.beans.NumLen;
import by.gsu.epamlab.comparators.DescendingHashSetComparator;
import by.gsu.epamlab.comparators.DescendingNumberComparator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class HashSetRunner {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader(Constants.FILE_NAME))){
            Set<HashSetNumLen> setNumLen = new HashSet<>();
            List<Integer> array = ArrayCreator.getE();
            long start = System.currentTimeMillis();
            for (int length: array) {
                HashSetNumLen numLen = new HashSetNumLen(length);
                setNumLen.add(numLen);
            }
            List<HashSetNumLen> list = new ArrayList<>(setNumLen);
            Collections.sort(list, new DescendingHashSetComparator());
            long end = System.currentTimeMillis();
            System.out.println(end - start);


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
