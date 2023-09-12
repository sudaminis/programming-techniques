package concepts.multithreading.synchronizationobjects.semaphore.producerconsumer;

import java.util.concurrent.Semaphore;

public class ProducerConsumerDemo {
    int n;
    static Semaphore consumerSemaphore = new Semaphore(0);
    static Semaphore producerSemaphore = new Semaphore(1);

    public static void main(String[] args) {

       ProducerConsumerDemo demo = new ProducerConsumerDemo();

       Thread producerThread = new Thread(new ProducerThread(demo));
       producerThread.start();
        Thread consumerThread = new Thread(new ConsumerThread(demo));
        consumerThread.start();
    }

    void get() {
        try {
            consumerSemaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Got " + n);
        producerSemaphore.release();
    }

    public void put(int n) {
        try {
            producerSemaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.n = n;
        System.out.println("Put: " +n );
        consumerSemaphore.release();
    }

}
