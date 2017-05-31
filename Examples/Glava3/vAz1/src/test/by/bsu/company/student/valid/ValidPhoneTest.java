package test.by.bsu.company.student.valid;

import by.bsu.company.student.valid.ValidPhone;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HP on 18.01.2017.
 */
public class ValidPhoneTest {
    @Test
    public void isValidPhone() throws Exception {
        Assert.assertTrue(ValidPhone.isValidPhone("+375331234567"));
    }

}