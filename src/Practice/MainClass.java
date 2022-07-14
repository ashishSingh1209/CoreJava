package Practice;

public class MainClass {
    public static void main(String[] args) throws Exception {
        User user = new User("Ashish","9876543210","detroit","Ashadaish12a");
        UserBO.validate(user);
    }
}
