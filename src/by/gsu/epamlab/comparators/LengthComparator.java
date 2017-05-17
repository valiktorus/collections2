package by.gsu.epamlab.comparators;

import by.gsu.epamlab.beans.NumLen;

import java.util.Comparator;

public class LengthComparator implements Comparator<NumLen>{

    @Override
    public int compare(NumLen first, NumLen second) {
        return first.getLength() - second.getLength();
    }
}
