package concepts.multithreading.synchronizationobjects.semaphore.simple;

public class Shared {
    static int counter;

    public static int increment() {
        return ++counter;
    }

    public static int decrement() {
        return --counter;
    }
}
