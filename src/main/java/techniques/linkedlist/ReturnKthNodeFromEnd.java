package techniques.linkedlist;
/*
Given the head of a linked list and an integer k, return the k'th node from the end.
For example, given the linked list that represents 1 -> 2 -> 3 -> 4 -> 5 and k = 2,
return the node with value 4, as it is the 2nd node from the end.
 */
public class ReturnKthNodeFromEnd {
    public static void main(String...args) {
        SingleNode first = new SingleNode();
        first.setVal(1);
        SingleNode second = new SingleNode();
        second.setVal(2);
        first.setNext(second);
        SingleNode third = new SingleNode();
        third.setVal(3);
        second.setNext(third);
        System.out.println(returnKth(2, first));

    }

    private static SingleNode returnKth(int i, SingleNode first) {

        SingleNode slow = first;
        SingleNode fast = first;
        int count = 0;
        while ( count < i ) {
            fast = fast.getNext();
            ++count;
        }

        while( fast != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }

        return slow;
    }


}
