package linkedlists;

import java.util.HashMap;
import java.util.Map;

/*
* This task is a real mess when it comes to testing, so skipping it
*/
public class CopyWithRandomPointer {
    public Node copyRandomList(Node head) {
        // phase 1 creating and populating HashMap with original and copy node(without links)
        Map<Node, Node> nodeMap = new HashMap<>();
        var headPointer = head;
        while (headPointer != null) {
            nodeMap.put(headPointer, new Node(headPointer.val));
            headPointer = headPointer.next;
        }

        // phase 2, populating the links of copy node from the map values
        headPointer = head;
        var dummy = new Node(0);
        var coppyPointer = dummy;
        while (headPointer != null) {
            Node copyNode = nodeMap.get(headPointer);
            copyNode.next = nodeMap.get(headPointer.next);
            copyNode.random = nodeMap.get(headPointer.random);
            coppyPointer.next = copyNode;
            coppyPointer = coppyPointer.next;
            headPointer = headPointer.next;
        }

        return dummy.next;
    }
}