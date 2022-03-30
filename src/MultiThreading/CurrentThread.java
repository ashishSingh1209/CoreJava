package MultiThreading;


class A implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("In Run This line is executed by: " + Thread.currentThread().getPriority());
        }

    }
}

public class CurrentThread {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
        t.setPriority(10);
        t.start();
        Thread.currentThread().setPriority(1);
        for (int i = 0; i < 10; i++) {
            System.out.println("In Main This Line is executed by: " + Thread.currentThread().getPriority());
        }
    }

}