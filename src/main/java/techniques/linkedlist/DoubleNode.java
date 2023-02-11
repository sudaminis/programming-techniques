package techniques.linkedlist;

public class DoubleNode {
    int val;
    DoubleNode prev;
    DoubleNode next;

    @Override
    public String toString() {
        return "DoubleNode{" +
                "val=" + val +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }

    public static void main(String...args) {
        DoubleNode head = new DoubleNode();
        head.val = 1;
        head.prev = null;
        DoubleNode second = new DoubleNode();
        second.val = 2;
        head.next = second;
        second.prev = head;
        DoubleNode third = new DoubleNode();
        third.val = 3;
        third.prev = second;
        second.next = third;
        third.next = null;
        printList(head);
        DoubleNode nodeToBeAdded = new DoubleNode();
        nodeToBeAdded.val = 5;
        DoubleNode prevNode = head.next;
        addNode( prevNode, nodeToBeAdded);
        System.out.println("********");
        printList(head);
        deleteNode( head);
        System.out.println("********");
        printList(head);


    }

    private static void deleteNode(DoubleNode deleteMe) {
        //if you are deleting last node
        if( deleteMe.next == null ) {
            deleteMe.prev.next = null;
            return;
        }
        //if you are deleting first node
        if( deleteMe.prev == null) {
            deleteMe.next.prev = null;
            return;
        }

        deleteMe.prev.next = deleteMe.next;
        deleteMe.next.prev = deleteMe.prev;
        deleteMe.prev = null;
        deleteMe.next = null;
    }

    private static void addNode(DoubleNode prevNode, DoubleNode nodeToBeAdded) {
        if( prevNode.next == null ) {
            prevNode.next = nodeToBeAdded;
            nodeToBeAdded.prev = prevNode;
            return;
        }
        DoubleNode savedNode = prevNode.next;
        prevNode.next = nodeToBeAdded;
        nodeToBeAdded.prev = prevNode;
        nodeToBeAdded.next = savedNode;
        savedNode.prev = nodeToBeAdded;

    }

    private static void printList(DoubleNode head) {
        DoubleNode node = head;
        while( node != null ) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
