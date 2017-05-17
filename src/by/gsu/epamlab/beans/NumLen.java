package by.gsu.epamlab.beans;

public class NumLen implements Comparable<NumLen>{
    private final int length;
    private int number;

    public NumLen(int length){
        this(length, 1);

    }
    public NumLen(int length, int number) {
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

        NumLen numLen = (NumLen) o;

        return length == numLen.length;
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
    public int compareTo(NumLen o) {
        return length - o.length;
    }
}
