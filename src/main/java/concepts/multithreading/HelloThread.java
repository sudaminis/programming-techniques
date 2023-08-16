package concepts.multithreading;

public class HelloThread extends Thread {
    public static void main(String[] args) {
        new HelloThread().start();
    }
    public void run() {
        System.out.println("Running : " +currentThread().getName());
    }
}
