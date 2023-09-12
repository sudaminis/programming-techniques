package concepts.multithreading.synchronizationobjects.semaphore.producerconsumer;

public class ProducerThread implements Runnable {


    String threadName;
    ProducerConsumerDemo demo;
    public ProducerThread(ProducerConsumerDemo demo) {
       this.demo = demo;
       threadName = "PRODUCER";
    }

    @Override
    public void run() {
        System.out.println("Started " +threadName);
        for( int i = 0; i < 5; i++) {
            demo.put(i);
        }
    }
}
