package LamdaExpression;

import Employee.Employee;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@FunctionalInterface
public interface Add {
    public int add(int a, int b);

}

class Adding {
    public static void main(String[] args) {
        Add a = Integer::sum;
        System.out.println(a.add(12, 112));
        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee("Ashish", "Java", 12, 1));
        employeeList.add(new Employee("Tyagi", "Java", 12, 2));
        employeeList.add(new Employee("Harsh", "Java", 12, 3));
        employeeList.add(new Employee("Harsh", "DevOps", 12, 4));
        employeeList.add(new Employee("Devansh", "DevOps", 12, 5));
        employeeList.add(new Employee("Raghav", "DevOps", 12, 6));

        //Comparator
        Collections.sort(employeeList, ((employee, t1) -> {
            return t1.getName().compareTo(employee.getName());
        }));


        ///Stream Collections
        List<String> name = employeeList.stream()
                .filter(employee -> employee.getDepartment().equals("DevOps"))
                .map(employee -> employee.getName())
                .collect(Collectors.toList());


        name.forEach(System.out::println);
    }


}