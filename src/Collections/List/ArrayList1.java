package Collections.List;

import java.util.ArrayList;
import java.util.List;



/*
* The ArrayList class implements the List interface.
* It uses a dynamic array to store the duplicate element of different data types.
* The ArrayList class maintains the insertion order and is non-synchronized.
* The elements stored in the ArrayList class can be randomly accessed.
 * */

class A implements Runnable {
    ArrayList a;

    A(ArrayList a) {
        this.a = a;
    }


    @Override
    public void run() {

            for (int i = 0; i < a.size(); i++) {
                System.out.println(a.get(i));
            }

    }}

    public  class ArrayList1 {
        public static void main(String[] args) {
            List<Integer> a = new ArrayList<>();
            a.add(1);
            a.add(2);
            a.add(3);
            a.add(4);
            a.add(5);
            a.add(6);

            Thread t = new Thread(new A((ArrayList) a));
            Thread t1 = new Thread(new A((ArrayList) a));
            t.start();
            t1.start();
        }
    }
