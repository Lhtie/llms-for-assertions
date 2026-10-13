package examples.mut001;

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

    public void remove(int i) {
        if (i < 0 || i >= size)
            throw new IndexOutOfBoundsException();
        System.arraycopy(data, i + 1, data, i, size - i - 1);
        size--;
        // @@@ It removes element i.
        // assert this.size()==\old(this.size())-1 && (\forall int j; 0<=j && j<i; this.get(j)==\old(this.get(j))) && (\forall int j; i<=j && j<this.size(); this.get(j)==\old(this.get(j+1)));
    }
}
