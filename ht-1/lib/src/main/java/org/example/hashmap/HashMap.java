package main.java.org.example.hashmap;

import java.util.LinkedList;

public class HashMap<K, V> {
    private static final int defaultCapacity = 8;

    private int size = 0;
    private int capacity = defaultCapacity;
    private LinkedList<EntryMap<K, V>> buckets[];
    private float loadFactor = 6.5f;

    public HashMap() {
        buckets = initTab(capacity);
    }

    private LinkedList<EntryMap<K, V>>[] initTab(int capacity) {
        var tab = new LinkedList[capacity];
        for (int idx = capacity - 1; idx >= 0; idx--) {
            tab[idx] = new LinkedList<>();
        }
        return tab;
    }

    private void rebuild() {
        if ((float)size / capacity <= loadFactor) return;

        LinkedList<EntryMap<K, V>>[] old = buckets;
        capacity <<= 1;
        buckets = initTab(capacity);

        for (int idx = old.length - 1; idx >= 0; idx--) {
            for (var e : old[idx]) {
                buckets[e.getHash() & (capacity - 1)].addLast(e);
            }
        }
    }

    public V get(K key) {
        var idx = hash(key) & (capacity - 1);

        for (var e : buckets[idx]) {
            if (e.getKey().equals(key)) {
                return e.getValue();
            }
        }
        return null;
    }

    public boolean put(K key, V value) {
        if (key == null) return false;

        var h = hash(key);
        var idx = h & (capacity - 1);
        for (var e : buckets[idx]) {
            if (e.getKey().equals(key)) {
                e.setValue(value);
                return true;
            }
        }
        if (!buckets[idx].add(new EntryMap<K, V>(key, value, h))) return false;
        
        size++;
        rebuild();

        return true;
    }

    public V remove(K key) {
        if (key == null) return null;

        var idx = hash(key) & (capacity - 1);
        for (var e : buckets[idx]) {
            if (e.getKey().equals(key)) {
                buckets[idx].remove(e);
                return e.getValue();
            }
        }
        return null;
    }

    private int hash(K key) {
        int h = key.hashCode();
        return key != null? h ^ (h >>> 16) : 0;
    }

    private class EntryMap<K, V> {
        private K key;
        private V value;
        private int hash;

        public EntryMap(K key, V value, int hash) {
            this.key = key;
            this.value = value;
            this.hash = hash;
        }

        public K getKey() {
            return key;
        }
        
        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public int getHash() {
            return hash;
        }
    }
}