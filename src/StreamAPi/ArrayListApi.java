package StreamAPi;

import Employee.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListApi {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(11);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        List<Integer> l = arrayList.stream()
                .map(i -> i + 1) //Use to update object
                .collect(Collectors.toList());
        l.forEach(i -> System.out.println(i));

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ashish", "Java", 12, 1));
        employeeList.add(new Employee("Tyagi", "Java", 12, 2));
        employeeList.add(new Employee("Harsh", "Java", 12, 3));
        employeeList.add(new Employee("Harsh", "DevOps", 12, 4));
        employeeList.add(new Employee("Devansh", "DevOps", 12, 5));
        employeeList.add(new Employee("Raghav", "DevOps", 12, 6));


        employeeList.stream()
                .filter(employee ->
                        employee.getDepartment().equals("DevOps")) //filter(Predicate) filter return streams predicate always returns boolean
                .peek(employee -> employee.setAge(21))//returns a new Stream consisting of all
                //the elements from the original Stream after applying a given Consumer action.
                .collect(Collectors.toList());
        System.out.println(employeeList.stream().filter(employee -> employee.getDepartment().equals("DevOps")).count());




        Comparator<Employee> c = (p1, p2) -> {
            if (p1.getName().length() == p2.getName().length()) {
                return -p1.getName().compareTo(p2.getName());
            }
            return Integer.compare(p1.getName().length(), p2.getName().length());
        };
        Collections.sort(employeeList, c);
        employeeList.forEach(employee -> System.out.println(employee.getName() + ": age: " + employee.getAge()));




        employeeList.stream()
                .sorted((employee, t1) -> -Integer.compare(employee.getName().length(), t1.getName().length()))
                .collect(Collectors.toList())
                .forEach(employee -> System.out.println(employee.getName()));


        System.out.println(employeeList.stream()
                .min(c) // Return first element from the Collection
                .get().getName());
        System.out.println(employeeList.stream()
                .max(c) // Return last element from the Collection
                .get().getName());


        //stream()->return stream
        //filter(predicate-->return boolean) // return-->Stream
        //sorted(comparator)-->return stream
        //min(comparator)-->return Optional


    }
}
