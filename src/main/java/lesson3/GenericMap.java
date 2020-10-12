package lesson3;

import java.util.HashMap;

public class GenericMap<T, U, K> {
    private HashMap<T, U> map = new HashMap<>();

    public void add(T key, U value) {
        map.put(key, value);
    }

    public K test(T t, U u) {
        return null;
    }
}
