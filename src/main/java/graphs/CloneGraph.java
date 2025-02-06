package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    private final Map<Node, Node> clones = new HashMap<>();

    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }

        if (clones.containsKey(node)) {
            return clones.get(node);
        }

        Node copy = new Node(node.val);
        clones.put(node, copy);
        for (Node neighbour: node.neighbors) {
            copy.neighbors.add(cloneGraph(neighbour));
        }
        return copy;
    }

    public Node cloneGraph2(Node node) {
        if (node == null) {
            return null;
        }

        var headPointer = node;
        while (headPointer != null) {
            clones.put(headPointer, new Node(headPointer.val));
            for(Node neighbours: headPointer.neighbors) {
                headPointer = neighbours;
            }
        }
        if (clones.containsKey(node)) {
            return clones.get(node);
        }

        Node copy = new Node(node.val);
        clones.put(node, copy);
        for (Node neighbour: node.neighbors) {
            copy.neighbors.add(cloneGraph(neighbour));
        }
        return copy;
    }

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
