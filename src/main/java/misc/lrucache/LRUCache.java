package misc.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    // member variables
    int capacity;
    Map<Integer, ListNode> dictionary;
    ListNode head;
    ListNode tail;

    LRUCache(int capacity ) {
        this.capacity = capacity;
        dictionary = new HashMap<>();
        head = new ListNode(-1, -1);
        tail = new ListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key ) {
        if( !dictionary.containsKey(key)) {
            return -1;
        }
        ListNode node = dictionary.get(key);
        // since this node was most recently accessed, move it to the end of the list
        remove(node);
        add(node);
        return node.val;
    }

    public void put( int key, int value) {

        //1. create listnode using supplied parameters
        ListNode newNode = new ListNode(key,value);

        //2. if the key already exists
        if( dictionary.containsKey(key)) {
            ListNode oldNode = dictionary.get(key);
            remove(oldNode);
        }
        dictionary.put(key, newNode);
        add(newNode);

        //5. if the capacity is greater than provided capacity, then delete first node.
        ListNode nodeToBeDeleted = head.next;
        remove(nodeToBeDeleted);
        dictionary.remove(nodeToBeDeleted.key);
    }

    public void remove(ListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void add(ListNode node) {
        ListNode previousLastNode = tail.prev;
        previousLastNode.next = node;
        node.prev = previousLastNode;
        node.next = tail;
        tail.prev = node;
    }

}
