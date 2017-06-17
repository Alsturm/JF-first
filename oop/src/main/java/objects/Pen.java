package objects;

public class Pen {
    private int price;
    private String producerName;

    @Override
    public boolean equals(Object o) {
        Pen pen;
        return this == o
                || o != null
                && o.getClass() == Pen.class
                && price == (pen = (Pen) o).price
                && (producerName != null ? producerName.equals(pen.producerName) :
                pen.producerName == null);
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (producerName != null ? producerName.hashCode() : 0);
        return result;
    }
}
