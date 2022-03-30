package MultiThreading;

class deadLock implements Runnable {

    static Thread mainThread;

    @Override
    public void run() {
        try {
            mainThread.join(); //Main thread
            for (int i = 0; i < 10; i++) {
                System.out.println("In Child");
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class DeadLock {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new deadLock());
        deadLock.mainThread = Thread.currentThread();
        thread.start();
          /*This is the deadlock situation where thread is waiting to complete main thread and
        main thread is waiting to complete thread.join() thread.
*/
        thread.join();

        for (int i =0;i<10;i++){
            System.out.println("In Parent");
        }
    }
}
