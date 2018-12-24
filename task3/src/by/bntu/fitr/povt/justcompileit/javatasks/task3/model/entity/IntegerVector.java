package by.bntu.fitr.povt.justcompileit.javatasks.task3.model.entity;


public class IntegerVector {

    public static final int MIN_ARRAY_SIZE = 0;


    private int[] vector;

    public IntegerVector(int... elements) {
        this.vector = elements;
    }

    public IntegerVector(int size) {
        if (size >= MIN_ARRAY_SIZE) {
            this.vector = new int[size];
        } else {
            throw new NegativeArraySizeException();
        }
    }

    public boolean isNull() {
        return vector == null;
    }

    public int getVectorLength() {
        return vector.length;
    }

    public int getElementOfIndex(int index) {
        if (index >= MIN_ARRAY_SIZE && index < vector.length) {
            return vector[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void setElementOfIndex(int index, int value) {
        if (index >= MIN_ARRAY_SIZE && index < vector.length) {
            vector[index] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {

        StringBuilder vectorElements = new StringBuilder();

        for (int vectorEl : vector) {
            vectorElements.append(vectorEl).append(" ");
        }
        return vectorElements.toString();
    }
}
