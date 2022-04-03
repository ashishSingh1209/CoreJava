package Collections.List;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CommonSynchronousChecker implements Runnable {
    List l = null;
    Vector c = null;


    CommonSynchronousChecker(List l) {
        this.l = l;
    }

    CommonSynchronousChecker(Vector c) {
        this.c = c;
    }

    @Override

    public void run() {
        if (l != null) {
            for (int i = 0; i < l.size(); i++) {
                System.out.println(l.get(i));
            }
        } else {
            Iterator <Integer> iterator = c.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }
    }
}
