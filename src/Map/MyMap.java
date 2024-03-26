package Map;

import java.util.ArrayList;

public class MyMap <K, V> {
    public ArrayList<K> keys;
    public ArrayList<V> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(K key, V value){
        int index = keys.indexOf(key);
        if(index != -1){
            //Meaning nag-exist si key
            values.set(index, value);
        } else {
            //If wala pa nagexist si key automatic add ra
            keys.add(key);
            values.add(value);
        }
    }

    public V get (K key){
        int index = keys.indexOf(key);
        if(index != -1){
            //Key exists, return value
            return values.get(index);
        } else {
            //Key does not exist, return null (daw)
            return null;
        }
    }
    public V remove(K key){
        int index = keys.indexOf(key);
        if(index != -1){
            //Key exists, remove key and value from respective arrays, return value;
            keys.remove(index);
            return values.remove(index);
        } else {
            //If key does not exist, return null;
            return null;
        }
    }
}
