package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatePayOffMonthsTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        CalculatePayOffMonths calcMonths=new CalculatePayOffMonths();
        double expected=70;
        double actual=calcMonths.calculateMonthsUntilPaidOff((12/100f)/365f,5000,100);
        assertEquals(expected,actual);
    }
}