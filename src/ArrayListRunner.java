import by.gsu.epamlab.beans.NumLen;
import by.gsu.epamlab.comparators.DescendingNumberComparator;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListRunner {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader(Constants.FILE_NAME))){
            List<NumLen> numLens = new ArrayList<>();
            List<Integer> array = ArrayCreator.getE();
            long start = System.currentTimeMillis();
            for (int length: array) {
                NumLen numLen = new NumLen(length);
                int index = Collections.binarySearch(numLens, numLen);

                if (index >= Constants.ZERO){
                    numLens.get(index).incrementNumber();
                }else {
                    numLens.add(numLen);
                    Collections.sort(numLens);
                }
            }

            Collections.sort(numLens, new DescendingNumberComparator());
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
