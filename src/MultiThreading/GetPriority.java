package MultiThreading;
class Test implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class GetPriority extends Thread {
    public static void main(String[] args) {

        Thread t = new Thread(new Test());
        t.start();
        System.out.println( Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);

        /*Main Thread is parent thread and t is child thread so whatever the priority parent thread has the
        same priority will be there for the child thread.*/

        //Default main priority is 5


        System.out.println("Child thread Priority: "+ t.getPriority());
        System.out.println("Parent Thread Priority: " + Thread.currentThread().getPriority());
    }
}
