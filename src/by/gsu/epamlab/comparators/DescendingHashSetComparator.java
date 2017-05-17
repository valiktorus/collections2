package by.gsu.epamlab.comparators;

import by.gsu.epamlab.beans.HashSetNumLen;
import by.gsu.epamlab.beans.NumLen1;

import java.util.Comparator;

public class DescendingHashSetComparator implements Comparator<HashSetNumLen> {

    @Override
    public int compare(HashSetNumLen first, HashSetNumLen second) {
        return second.getNumber() - first.getNumber();
    }
}