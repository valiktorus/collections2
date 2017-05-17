package by.gsu.epamlab.beans;

public class HashSetNumLen {
    private final int length;
    private int number;

    public HashSetNumLen(int length){
        this(length, 1);

    }
    public HashSetNumLen(int length, int number) {
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

        HashSetNumLen numLen = (HashSetNumLen) o;
        ((HashSetNumLen) o).number++;

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

}
