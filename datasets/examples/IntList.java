package examples;

import java.util.Arrays;

public class IntList {
    private int[] data = new int[8];

    private int size;

    public IntList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return data[index];
    }

    public boolean contains(int value) {
        for (int k = 0; k < size; k++) {
            if (data[k] == value)
                return true;
        }
        return false;
    }

    public boolean add(int value) {
        if (size == data.length)
            data = Arrays.copyOf(data, size * 2);
        data[size++] = value;
        return true;
    }

    /**
     * Returns the index of the first occurrence of value among the positions
     * from lo (inclusive) to hi (exclusive), or -1 if value does not occur
     * there.
     */
    public int findRange(int value, int lo, int hi) {
        for (int k = Math.max(lo, 0); k < hi && k < size; k++) {
            if (data[k] == value)
                return k;
        }
        return -1;
        // @@@ If findRange finds the element, the index should be within the range, and contain the value.
        // assert \result!=-1 => \result>=lo && \result<hi && this.get(\result)==value;
        // @@@ If findRange does not find the element, then the value should not be present in the range.
        // assert \result==-1 => (\forall int i; i>=lo && i<hi; this.get(i)!=value);
    }
    
}
