package Collections.List;


import java.util.*;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        Iterator<Integer> itr = a.iterator();
        while (itr.hasNext()){
            int i = itr.next();
            if(i==2){
                System.out.println(i);
            }else itr.remove();
        }

        System.out.println(Arrays.toString(a.toArray()));
    }
}
