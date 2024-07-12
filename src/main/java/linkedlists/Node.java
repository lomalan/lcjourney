package linkedlists;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node(int val, Node next, Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                ", random=" + random +
                '}';
    }
}

