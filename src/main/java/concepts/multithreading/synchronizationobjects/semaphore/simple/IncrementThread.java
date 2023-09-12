package concepts.multithreading.synchronizationobjects.semaphore.simple;

import java.util.concurrent.Semaphore;

public class IncrementThread implements Runnable {
    Semaphore semaphore;
    String threadName;

    public IncrementThread(Semaphore semaphore, String threadName) {
        this.semaphore = semaphore;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Starting thread - " + threadName);
        try {
            semaphore.acquire();
            for( int i = 0; i < 5; i++ ) {
                System.out.println( "Incremented " + Shared.increment() );
            }
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
