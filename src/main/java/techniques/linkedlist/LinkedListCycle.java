package techniques.linkedlist;

public class LinkedListCycle {
    public static void main(String...main) {
        SingleNode first = new SingleNode();
        first.setVal(1);
        SingleNode second = new SingleNode();
        second.setVal(2);
        first.setNext(second);
        SingleNode third = new SingleNode();
        third.setVal(3);
        second.setNext(third);
        System.out.println(findCycle(first));
    }

    private static boolean findCycle(SingleNode first) {
        SingleNode fast = first;
        SingleNode slow = first;
        while( fast != null && fast.getNext() != null) {
            if( fast == slow ) {
                return true;
            }
            fast = fast.getNext().getNext().getNext();
            slow = slow.getNext();
        }
        return false;
    }


}
