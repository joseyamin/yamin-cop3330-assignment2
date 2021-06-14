package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sol28Test { //cant test since input is needed

    @Test
    void inputAndComputeTotalAddTo15() {
        Sol28 testClass=new Sol28();
        double expected=15;
        double actual=testClass.inputAndComputeTotal();
        assertEquals(expected,actual);
    }
}