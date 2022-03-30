package MultiThreading;


class B implements Runnable{

    @Override
    public void run() {
        System.out.println("In B"+Thread.currentThread().getName());
    }
}
public class Contructor {
    public static void main(String[] args) {
        B b = new B();
        Thread t = new Thread(b,"Value");
        t.start();
        System.out.println("In Main"+Thread.currentThread().getName());

        System.out.println(t.getName());
    }
}
