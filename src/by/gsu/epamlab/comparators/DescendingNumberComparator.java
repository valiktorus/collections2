package by.gsu.epamlab.comparators;

import by.gsu.epamlab.beans.Interval;

import java.util.Comparator;

public class DescendingNumberComparator  implements Comparator<Interval>{

    @Override
    public int compare(Interval first, Interval second) {
        return second.getNumber() - first.getNumber();
    }
}
