package techniques.stacksqueues;

import java.util.Arrays;

public class CircularQueue {
    int head;
    int tail;
    int count;
    int capacity;
    int[] arr;

    CircularQueue( int n) {
        arr = new int[n];
        capacity = n;
        head = 0;
        tail = 0;
        count = 0;
    }

    int front() {
        return arr[head];
    }

    int last() {
        return arr[tail];
    }

    boolean enqueue( int i) {
        if ( isFull() ) {
            return false;
        }
        int newTail = ( head + count  )  % capacity;
        arr[newTail] = i;
        tail = newTail;
        ++count;
        return true;
    }

    boolean dequeue() {
        if( isEmpty()) {
            return false;
        }
        int newHead = ( head + 1) % capacity;
        head = newHead;
        --count;
        return true;
    }

    boolean isEmpty() {
        return count == 0;
    }

    boolean isFull() {
        return count == capacity;
    }
    public static void main(String...args) {
        CircularQueue queue = new CircularQueue(4);
        System.out.println("Queue before enqueue = " +queue);
        queue.enqueue(1);
        System.out.println("Queue after first enqueue = " +queue);
        queue.enqueue(2);
        System.out.println("Queue after second enqueue = " +queue);
        queue.enqueue(3);
        System.out.println("Queue after third enqueue = " +queue);
        queue.enqueue(4);
        System.out.println("Queue after fourth enqueue = " +queue);


        queue.dequeue();
        System.out.println("Queue after dequeue operation = " +queue);
        queue.enqueue(5);
        System.out.println("Queue after enqueue operation = " +queue);
        queue.dequeue();
        queue.dequeue();
        System.out.println("Queue after two dequeues = " +queue);
        queue.enqueue(6);
        System.out.println(queue);
        queue.enqueue(7);
        System.out.println(queue);
        queue.enqueue(8);
        System.out.println(queue);

        System.out.println("head = " +queue.front());
        System.out.println("tail = " +queue.last());


    }

    @Override
    public String toString() {
        return "CircularQueue{" +
                "head=" + head +
                ", tail=" + tail +
                ", count=" + count +
                ", capacity=" + capacity +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
