package concepts.multithreading.synchronizationobjects.semaphore.producerconsumer;


public class ConsumerThread implements Runnable {
    String threadName;
    ProducerConsumerDemo demo;
    public ConsumerThread(ProducerConsumerDemo demo) {
        this.demo = demo;
        this.threadName = "CONSUMER";
    }

    @Override
    public void run() {
        System.out.println("Started " +threadName);
        for( int i = 0; i < 20; i++ ) {
            demo.get();
        }

    }
}
