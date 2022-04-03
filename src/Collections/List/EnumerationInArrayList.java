package Collections.List;

import java.util.*;

public class EnumerationInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
             Enumeration<Integer> e = Collections.enumeration(a);
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
