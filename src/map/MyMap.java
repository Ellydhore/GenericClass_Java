package map;

import java.util.ArrayList;

public class MyMap <K, V> {
    private ArrayList<K> keys;
    private ArrayList<V> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(K key, V value) {
        int index = keys.indexOf(key);
        if(index == -1) {
            keys.add(keys.size(), key);
            values.add(values.size(), value);
        } else {
            values.set(index, value);
        }
    }

    public V get(K key) {
        int index = keys.indexOf(key);
        if(index != -1) {
            return values.get(index);
        }
        return null;
    }

    public V remove(K key) {
        int index = keys.indexOf(key);
        if(index != -1) {
            keys.remove(index);
            return values.remove(index);
        }
        return null;
    }
}
