package by.gsu.epamlab;

public class IntervalCounter {
    private Interval interval;
    private int quantity;

    public IntervalCounter(Interval interval, int quantity) {
        this.interval = interval;
        this.quantity = quantity;
    }

    public Interval getInterval() {
        return interval;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%d;%d", interval.getLength(), quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntervalCounter that = (IntervalCounter) o;

        return interval != null ? interval.equals(that.interval) : that.interval == null;
    }

    @Override
    public int hashCode() {
        return interval != null ? interval.hashCode() : 0;
    }
}
