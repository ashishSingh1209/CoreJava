package MultiThreading;

class Circle extends Thread {
    private float radius = 0.0f;
    public synchronized void outPut(){
        if(radius==0.0f) System.out.println("waiting for input");
        else{
            System.out.println("Area of circle is "+ 3.14*radius*radius);
        }
    }
    public synchronized void inPut(float radius){
        System.out.println("Radius is acquired");
        this.radius=radius;
        notify();

    }
}

public class Notify {
    public static void main(String[] args) {
        Circle c = new Circle();
        new Thread(){
            @Override
            public void run() {
                c.inPut(2.2f);
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                c.outPut();
            }
        }.start();


    }
}

