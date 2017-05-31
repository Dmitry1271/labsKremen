package by.bsu.company.student.valid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by HP on 18.01.2017.
 */
public class ValidPhone {
    public static boolean isValidPhone(String phone){
        Pattern p1 = Pattern.compile(RegExpPhone.mobilPhone);
        Matcher m1 = p1.matcher(phone);
        return m1.matches();
    }
}
