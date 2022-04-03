package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        Iterator<String> it = hashSet.iterator();
        System.out.println( it.hashCode());
    }
}
