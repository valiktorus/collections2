package by.gsu.epamlab.beans;

public class NumLen1 implements Comparable<NumLen1>{
    private final int length;
    private int number;

    public NumLen1(int length){
        this(length, 1);

    }
    public NumLen1(int length, int number) {
        this.length = length;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public int getLength() {
        return length;
    }

    public void incrementNumber(){
        number++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumLen1 numLen1 = (NumLen1) o;

        return length == numLen1.length;
    }

    @Override
    public int hashCode() {
        return length;
    }

    @Override
    public String toString() {
        return length + ";" + number;
    }

    @Override
    public int compareTo(NumLen1 o) {
        int diff = length - o.length;
        if (diff == 0){
            o.number++;
        }
        return diff;
    }
}
