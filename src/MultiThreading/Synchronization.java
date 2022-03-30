package MultiThreading;

class Display {


    public synchronized void wish(String name) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Good Morning "+ name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class ThreadDisplay implements Runnable {
    String name;
    Display d;

    public ThreadDisplay(String name, Display d) {
        this.name = name;
        this.d = d;
    }


    @Override
    public void run() {
        try {

            d.wish(name);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}


public class Synchronization {
    public static void main(String[] args) {
        Display d = new Display();
        Thread thread = new Thread(new ThreadDisplay("Ashish",d));
        Thread thread1 = new Thread(new ThreadDisplay("Singh",d));
        thread.start();

        thread1.start();
    }
}
