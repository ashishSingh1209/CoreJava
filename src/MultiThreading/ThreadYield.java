package MultiThreading;

class CommonClass implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("In Common Class " + i);
            Thread.yield();
        }
    }
}

public class ThreadYield {
    public static void main(String[] args) {
        CommonClass commonClass = new CommonClass();
        Thread t = new Thread(commonClass);
        t.setPriority(1);
        t.start();

        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside Main " + i);
        }
    }
}
