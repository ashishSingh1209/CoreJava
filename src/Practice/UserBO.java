package Practice;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserBO {
    static void validate(User u) throws Exception {
        String passVLength = "(?=\\S+$).{10,20}$";
        Pattern p = Pattern.compile(passVLength);
        Matcher m = p.matcher(u.getPassword());
        if (m.matches()) {
            String passVDigit = "(?=.*[0-9])";
            Pattern pdigit = Pattern.compile(passVDigit);
            Matcher mDigit = pdigit.matcher(u.getPassword());
            if (mDigit.matches()) {
                String passVSymb = "(?=.*[!@#$%^&*])";
                Pattern pSymb = Pattern.compile(passVSymb);
                Matcher mSymb = pSymb.matcher(u.getPassword());
                if(mSymb.matches()){
                    System.out.println("Valid password");
                }else throw new Exception("Should contains at least one symbol");

            }
            else throw new Exception("Should contains at least one number");
        }

        else {
            throw new Exception("Should be of length 10 t0 20");
        }


    }
}
