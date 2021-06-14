package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidCheckerTest {

    @Test
    void firstNameValidReturnTrue() {
        ValidChecker checker=new ValidChecker();
        boolean expected=true;
        boolean actual=checker.firstNameValid("jose");
        assertEquals(expected,actual);
    }
    @Test
    void firstNameValidReturnFalse() {
        ValidChecker checker=new ValidChecker();
        boolean expected=false;
        boolean actual=checker.firstNameValid("J");
        assertEquals(expected,actual);
    }

    @Test
    void lastNameValidReturnTrue() {
        ValidChecker checker=new ValidChecker();
        boolean expected=true;
        boolean actual=checker.firstNameValid("yamin");
        assertEquals(expected,actual);
    }
    @Test
    void lastNameValidReturnFalse() {
        ValidChecker checker=new ValidChecker();
        boolean expected=false;
        boolean actual=checker.firstNameValid("yamin");
        assertEquals(expected,actual);
    }

    @Test
    void zipCodeValidReturnFalse() {
        ValidChecker checker=new ValidChecker();
        boolean expected=false;
        boolean actual=checker.firstNameValid("1234");
        assertEquals(expected,actual);
        actual=checker.firstNameValid("1234a");
        assertEquals(expected,actual);
    }

    @Test
    void employeeIDValidReturnTrue() {
        ValidChecker checker=new ValidChecker();
        boolean expected=true;
        boolean actual=checker.firstNameValid("ad-1223");
        assertEquals(expected,actual);
    }
    @Test
    void employeeIDValidReturnFalse() {
        ValidChecker checker=new ValidChecker();
        boolean expected=false;
        boolean actual=checker.firstNameValid("11-1223");
        assertEquals(expected,actual);
        actual=checker.firstNameValid("aa-abcd");
        assertEquals(expected,actual);
        actual=checker.firstNameValid("aa1223");
        assertEquals(expected,actual);
    }
}