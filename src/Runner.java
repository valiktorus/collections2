import by.gsu.epamlab.beans.Interval;
import by.gsu.epamlab.comparators.DescendingNumberComparator;
import by.gsu.epamlab.comparators.LengthComparator;
import by.gsu.epamlab.factory.IntervalFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader(Constants.FILE_NAME))){
            List<Interval> intervals = new ArrayList<>();
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] coordinates =  line.split(Constants.COORDINATES_REGEX);
                Interval interval = IntervalFactory.getInterval(coordinates);
                Collections.sort(intervals, new LengthComparator());
                int index = Collections.binarySearch(intervals, interval, new LengthComparator());
                if (index < Constants.ZERO){
                    intervals.add(interval);
                }else {
                    intervals.get(index).incrementNumber();
                }
            }
            Collections.sort(intervals, new DescendingNumberComparator());
            printList(intervals);

        } catch (FileNotFoundException e) {
            System.err.println(Constants.FILE_NOT_FOUND);
        }
    }

    private static <E> void printList(List<E> list){
        for (E element: list) {
            System.out.println(element);
        }
    }
}
