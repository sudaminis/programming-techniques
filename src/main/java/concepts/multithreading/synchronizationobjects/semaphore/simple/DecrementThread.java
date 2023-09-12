package concepts.multithreading.synchronizationobjects.semaphore.simple;

import java.util.concurrent.Semaphore;

public class DecrementThread implements Runnable {
    Semaphore semaphore;
    String threadName;

    public DecrementThread(Semaphore semaphore, String threadName) {
        this.semaphore = semaphore;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Starting thread - " +threadName);
        try {
            semaphore.acquire();
            for( int i = 0; i < 5; i++ ) {
                System.out.println( "Decremented " + Shared.decrement() );
            }
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
