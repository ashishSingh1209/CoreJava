package Collections.Set;


import Employee.Employee;
import Employee.*;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;



public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Employee> t = new TreeSet<>(new MyCompator());
        t.add(new Employee("Ashish","IT",1,4));
        t.add(new Employee("Kumar","ZZZ",4,2));
        t.add(new Employee("Singh","ECE",6,1));
        t.add(new Employee("Ashish","AAA",3,3));
        Iterator<Employee> it = t.iterator();
        while (it.hasNext()){
            Employee e = it.next();
            System.out.println(e.getName()+" Id is "+e.getId());
        }


    }
}
