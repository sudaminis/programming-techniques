package techniques.linkedlist;

/*
Example 1: Given the head of a linked list with an odd number of nodes head,
return the value of the node in the middle.

For example, given a linked list that represents 1 -> 2 -> 3 -> 4 -> 5, return 3.
 */
public class TwoPointersGetMiddle {

    public static void main(String...args) {
        SingleNode first = new SingleNode();
        first.setVal(1);
        SingleNode second = new SingleNode();
        second.setVal(2);
        first.setNext(second);
        SingleNode third = new SingleNode();
        third.setVal(3);
        second.setNext(third);

        System.out.println( findMiddle(first) );


    }

    private static int findMiddle(SingleNode first) {
        SingleNode head = first;
        SingleNode slow = head;
        SingleNode fast = head;

        while( fast != null && fast.getNext() != null ) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return slow.getVal();
    }


}
