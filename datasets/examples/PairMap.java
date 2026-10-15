package examples;

import java.util.ArrayList;

public class PairMap {
    private final ArrayList<String> keys = new ArrayList<>();

    private final ArrayList<String> values = new ArrayList<>();

    public PairMap() {
    }

    public int size() {
        return keys.size();
    }

    public boolean containsKey(String key) {
        return keys.contains(key);
    }

    public boolean containsValue(String value) {
        return values.contains(value);
    }

    public int indexOf(String key) {
        return keys.indexOf(key);
    }

    public String valueAt(int index) {
        return values.get(index);
    }

    public void put(String key, String value) {
        int index = keys.indexOf(key);
        if (index >= 0) {
            values.set(index, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    /**
     * Returns the value associated with the given key, or null if the key is
     * not present.
     */
    public String getKey(String key) {
        for (int k = 0; k < values.size(); k++) {
            if (values.get(k).equals(key))
                return values.get(k);
        }
        return null;
        // @@@ If the key is present, the returned value is the value stored with that key.
        // assert this.containsKey(key) => \result==this.valueAt(this.indexOf(key));
    }
}
