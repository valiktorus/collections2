package by.gsu.epamlab.comparators;

import by.gsu.epamlab.beans.Interval;

import java.util.Comparator;

public class LengthComparator implements Comparator<Interval>{

    @Override
    public int compare(Interval first, Interval second) {
        return first.getLength() - second.getLength();
    }
}
