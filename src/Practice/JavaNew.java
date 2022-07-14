package Practice;
import java.util.Scanner;
import java.util.regex.*;
public class JavaNew {

    static class User{
        private String name;
        private String mobile;
        private String username;
        private String password;

        User(String name,String mobile,String username, String password){
            this.name=name;
            this.mobile=mobile;
            this.username=username;
            this.password=password;
        }


        void validate() throws Exception{

            String regex1 = "^(?=.*[0-9])";
            String regex2 = "(?=.*[@#$%^&+=])";
            String regex3 ="(?=\\S+$).{10,20}$";
            Pattern p1 = Pattern.compile(regex1);
            Pattern p2 = Pattern.compile(regex2);
            Pattern p3 = Pattern.compile(regex3);


            boolean try1=false;
            boolean try2=false;
            boolean try3=false;
            boolean try4=false;
            Matcher m1 = p1.matcher(this.password);
            Matcher m2 = p2.matcher(this.password);
            Matcher m3 = p3.matcher(this.password);


            if(m1.matches()){
                try1=true;
            }
            else {
                throw new Exception("Should contain atleast one number");
            }
            if(m2.matches()){
                try2=true;
            }
            else {
                throw new Exception("Should contain atleast one character");
            }
            if(m3.matches()){
                try3=true;
            }
            else {
                throw new Exception("Should contain minimum 10 and maximum 20 character");
            }

            if(try1 && try2 && try3){
                System.out.println("Valid Password");
            }



        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        String mobile = sc.nextLine();;
        String username= sc.nextLine();;
        String password= sc.nextLine();;
        User u = new User(name, mobile, username, password);
        try{
            u.validate();
        }catch (Exception ex) {
            System.err.print(ex);
        }

    }
}