package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthTest {

    @Test
    void passwordValidatorReturnsVeryWeak() {
        PasswordStrength passwordStrength=new PasswordStrength();
        //very weak case
        int expected=0;
        int actual=passwordStrength.passwordValidator("782642");
        assertEquals(expected,actual);
    }
    @Test
    void passwordValidatorReturnsWeak() {
        PasswordStrength passwordStrength=new PasswordStrength();
        //weak case
        int expected=1;
        int actual=passwordStrength.passwordValidator("jose12");
        assertEquals(expected,actual);
    }
    @Test
    void passwordValidatorReturnsStrong() {
        PasswordStrength passwordStrength=new PasswordStrength();
        //strong case
        int expected=2;
        int actual=passwordStrength.passwordValidator("123abc123");
        assertEquals(expected,actual);
    }
    @Test
    void passwordValidator() {
        PasswordStrength passwordStrength=new PasswordStrength();
        //very strong case
        int expected=3;
        int actual=passwordStrength.passwordValidator("jose@1234");
        assertEquals(expected,actual);
    }
}