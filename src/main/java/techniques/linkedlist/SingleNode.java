package techniques.linkedlist;

public class SingleNode {
    private int val;
    private SingleNode next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public static void main(String...args) {
        SingleNode one = new SingleNode();
        one.val = 1;

        SingleNode two = new SingleNode();
        two.val = 2;
        one.next = two;

        SingleNode three = new SingleNode();
        two.next = three;
        three.val = 3;

        SingleNode head = one;
        head.next = two;
        two.next = three;

        System.out.println("Sum of all values in a given linkedlist = " +getSum(head));
        System.out.println("Sum of all values in a given linkedlist = " +getSumRecursive(head));

        SingleNode nodeToBeAdded = new SingleNode();
        nodeToBeAdded.val = 4;
        addNode( head.next, nodeToBeAdded);

        System.out.println("New list after addition = " + head);

        deleteNode( head.next, head.next.next);
        System.out.println("New list after deletion = " + head);
    }

    private static void deleteNode(SingleNode prevNode, SingleNode nodeToBeDeleted) {
        prevNode.next = nodeToBeDeleted.next;

    }

    private static void addNode(SingleNode current, SingleNode nodeToBeAdded) {
        nodeToBeAdded.next = current.next;
        current.next = nodeToBeAdded;
    }

    private static int getSumRecursive(SingleNode head) {
        if( head == null ) {
            return 0;
        }
        int sum = head.val + getSumRecursive(head.next);
        return sum;
    }

    private static int getSum(SingleNode head) {
        SingleNode current = head;
        int sum = 0;
        while( current != null) {
            sum += current.val;
            current = current.next;
        }
        return sum;

    }

}
