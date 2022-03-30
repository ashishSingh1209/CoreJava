package Oop;

public class Officer extends Staff {
    public String grade;

    public Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }
}
