import by.gsu.epamlab.Interval;
import by.gsu.epamlab.IntervalCounter;
import by.gsu.epamlab.factory.IntervalFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader("src/in.txt"))){
            Set<IntervalCounter> intervalCounters = new TreeSet<>();
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] coordinates =  line.split("(\\s*\\)\\s*\\(\\s*)|\\s*[(;)]\\s*");
                Interval interval = IntervalFactory.getInterval(coordinates);
                IntervalCounter intervalCounter = new IntervalCounter(interval, 1);
                if (intervalCounters.contains(intervalCounter)){

                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
}
