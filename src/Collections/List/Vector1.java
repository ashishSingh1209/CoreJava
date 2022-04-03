package Collections.List;

import java.util.Collection;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        v.addElement(5);
        v.addElement(6);
        Thread thread = new Thread(new CommonSynchronousChecker(v));
        Thread thread1 = new Thread(new CommonSynchronousChecker(v));
        thread.start();
        thread1.start();

    }
}
