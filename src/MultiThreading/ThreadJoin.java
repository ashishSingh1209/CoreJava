package MultiThreading;

class threadJoin implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("In Upper Class  ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class threadJoin2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("In Lower Class ");
        }
    }
}


public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        threadJoin tj = new threadJoin();
        threadJoin2 tj2 = new threadJoin2();
        Thread t = new Thread(tj);
        Thread t2 = new Thread(tj2);

        //Until completing t it will not execute another thread t2 has to wait(In wait state).
        t.start();

        t.join();
      // t.join(10000); //Wait till 10 sec and than start executing t2

        t2.start();



    }
}
