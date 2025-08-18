import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // "true" enables access order (LRU behavior)
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity; // Remove least recently used entry when capacity is exceeded
    }
}

public class LinkedHMLru {
    public static void main(String[] args) {
        LRUCache<Integer, String> name = new LRUCache<>(3); // LRU Cache with capacity 3

        name.put(3, "parth");
        name.put(1, "ruturaj");
        name.put(2, "aniruddha");
        System.out.println(name); // Output: {3=parth, 1=ruturaj, 2=aniruddha}

        name.get(1); // Access "ruturaj", making it most recently used
        name.put(4, "new"); // "parth" (key 3) is removed as LRU

        System.out.println(name); // Output: {1=ruturaj, 2=aniruddha, 4=new}
    }
}
