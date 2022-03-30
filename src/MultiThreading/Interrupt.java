package MultiThreading;

class CommonClass1 implements Runnable {
    @Override
    public void run() {


        try {
            for (int i = 0; i <= 10; i++)
            {
                System.out.println("Child is sleeping");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }

    }
}

public class Interrupt {
    public static void main(String[] args) {
        Thread t = new Thread(new CommonClass1());
        t.start();
        //Throws Exception of InterruptedException
        t.interrupt();

    }
}
