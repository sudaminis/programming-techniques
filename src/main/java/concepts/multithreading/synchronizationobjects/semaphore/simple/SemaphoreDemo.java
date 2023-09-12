package concepts.multithreading.synchronizationobjects.semaphore.simple;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Thread a = new Thread(new IncrementThread(semaphore, "Increment"));
        a.start();
        Thread b = new Thread(new DecrementThread(semaphore, "Decrement"));
        b.start();
    }
}
