package linkedlists;


import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    // phase 1. Setup hash map for constant access
    // Setup left and right nodes to easy remove from the beginning and insert to the end
    private Map<Integer, DoubleNode> cache;
    private DoubleNode left;
    private DoubleNode right;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        left = new DoubleNode(0, 0);
        right = new DoubleNode(0, 0);

        // connecting nodes
        left.next = right;
        right.prev = left;
    }

    // phase 2. If we get value and it exists, it should be placed to the right node
    // because it started to be used most recently
    public int get(int key) {
        var node = cache.get(key);
        if (node == null) {
            return -1;
        }
        remove(node);
        insert(node);
        return node.val;
    }

    // phase 3. To put value we need to consider following rules:
    // 1. If key is already in map we need to reset the nodes like for a get operation
    // 2. If key is not present and capacity exceeded:
    // a) Find the left pointer key and remove it from the map
    // b) Remove it from a left pointer
    public void put(int key, int value) {
        DoubleNode node = cache.get(key);
        if (node != null) {
            remove(node);
        }
        var doubleNode = new DoubleNode(key, value);
        insert(doubleNode);
        cache.put(key, doubleNode);

        if (cache.size() > capacity) {
            DoubleNode lru = left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }

    // To insert value in the end we need:
    // 1. Assign node as a prev point of a dummy right node
    // 2. node next should be a right dummy node
    // 3. Former prev of dummy node next pointer should be pointed to node
    // 4. Prev pointer of a new node should be a former prev node
    private void insert(DoubleNode node) {
        var formerPrev = right.prev;
        var next = right;
        // 1 and 2
        next.prev = node;
        node.next = next;

        // 3 and 4
        formerPrev.next = node;
        node.prev = formerPrev;
    }

    // To remove value we need:
    // 1. Get the previous and the next nodes of a current node
    // 2. Link them together avoiding current node
    private void remove(DoubleNode node) {
        // 1
        var prev = node.prev;
        var next = node.next;

        // 2
        prev.next = next;
        next.prev = prev;
    }

    class DoubleNode {
        private int key;
        private int val;
        DoubleNode next;
        DoubleNode prev;

        public DoubleNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}

