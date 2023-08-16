package concepts.multithreading;

public class JoinDemo implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Runnable t1 = new JoinDemo();

        Thread childThread = new Thread(t1);
        childThread.start();
        System.out.println("Main thread waiting for child thread to finish");
        childThread.join();
        System.out.println("Main thread done waiting");
    }

    @Override
    public void run() {
        int t = 0;
        while(t < 20 ) {
            ++t;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
