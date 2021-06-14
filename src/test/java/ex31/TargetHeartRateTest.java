package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetHeartRateTest {

    @Test
    void calculateBPM() {
        TargetHeartRate targetHeartRateCalculator=new TargetHeartRate();
        double expected=138;
        double actual=Math.round(targetHeartRateCalculator.calculateBPM(22,65,55/100f));
        assertEquals(expected,actual);
    }
}