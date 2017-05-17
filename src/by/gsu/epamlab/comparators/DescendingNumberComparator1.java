package by.gsu.epamlab.comparators;

import by.gsu.epamlab.beans.NumLen1;

import java.util.Comparator;

public class DescendingNumberComparator1 implements Comparator<NumLen1> {

    @Override
    public int compare(NumLen1 first, NumLen1 second) {
        return second.getNumber() - first.getNumber();
    }
}

