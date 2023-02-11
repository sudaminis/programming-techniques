package techniques.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class GetMiddleOfLinkedList {
    public static void main(String...args) {
        SingleNode first = new SingleNode();
        first.setVal(1);
        SingleNode second = new SingleNode();
        second.setVal(2);
        first.setNext(second);
        SingleNode third = new SingleNode();
        third.setVal(3);
        second.setNext(third);
        SingleNode fourth = new SingleNode();
        fourth.setVal(4);
        third.setNext(fourth);
        SingleNode fifth = new SingleNode();
        fifth.setVal(5);
        fourth.setNext(fifth);
        SingleNode sixth = new SingleNode();
        sixth.setVal(6);
        fifth.setNext(sixth);

        System.out.println( findMiddle(first));
        System.out.println( findMiddlePutInArray(first));
    }

    /*
    We are told about the size of linked list, so we know the size of array we need to create.
     */

    private static int findMiddlePutInArray(SingleNode first) {

        List numList = new ArrayList<>();
        SingleNode head = first;
        while( head != null ) {
            numList.add(head.getVal());
        }

        return numList.size()/2;
    }

    private static SingleNode findMiddle(SingleNode first) {
        int count = 0;
        SingleNode head = first;
        while( head != null) {
            count++;
            head = head.getNext();
        }
        System.out.println("Total nodes = " +count);
        int middle;
        if( count % 2 == 0) {
            middle = count / 2;
        } else {
            middle = count /2 + 1;
        }
        System.out.println("Middle = " +middle);

        head = first;
        count = 0;
        while( head != null && head.getNext() != null && count < middle) {
            count++;
            head = head.getNext();
        }

        return head;
    }

}
