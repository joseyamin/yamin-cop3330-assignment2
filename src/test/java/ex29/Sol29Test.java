package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sol29Test {

    @Test
    void yearsToDoubleInvestmentReturn4() {
        Sol29 testClass=new Sol29();
        double expected=18;
        double actual=testClass.yearsToDoubleInvestment(4);
        assertEquals(expected,actual);
    }
    @Test
    void yearsToDoubleInvestmentReturn1() {
        Sol29 testClass=new Sol29();
        double expected=1;
        double actual=testClass.yearsToDoubleInvestment(72);
        assertEquals(expected,actual);
    }
}