package Oop;

public class Teacher extends Staff {
    public String subject;
    public String publication;

    public Teacher(int code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }
}
