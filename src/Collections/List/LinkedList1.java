package Collections.List;

/*
 * LinkedList implements the Collection interface.
 * It uses a doubly linked list internally to store the elements.
 * It can store the duplicate elements. It maintains the insertion order and is not synchronized.
 * In LinkedList, the manipulation is fast because no shifting is required.
 * */

import java.util.LinkedList;

class A1 implements Runnable {
    LinkedList a;

    A1(LinkedList a) {
        this.a = a;
    }


    @Override
    public void run() {

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

    }
}

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);

//Non Synchronous
        Thread t = new Thread(new A1(a));
        Thread t1 = new Thread(new A1(a));
        t.start();
        t1.start();
    }
}
