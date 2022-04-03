package Employee;

import java.io.Serializable;

public class Employee implements  Serializable{
    private String name;
    private String department;
    private int age;
    private int id;

    public Employee(String name, String department, int age,int id) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
}
