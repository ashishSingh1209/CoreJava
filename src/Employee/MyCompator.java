package Employee;

import java.util.Comparator;

public class MyCompator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        String name = ((Employee) o).getName();
        String name2 = ((Employee) t1).getName();
        if (name.equals(name2)) {
            Integer id = ((Employee) o).getAge();
            Integer id2 = ((Employee) t1).getAge();
            return -id.compareTo(id2);
        } else {
            return name.compareTo(name2);
        }
    }
}
