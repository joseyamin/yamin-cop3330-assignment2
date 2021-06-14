package ex31;

public class TargetHeartRate {
    public double calculateBPM(double age,double restingPulse,double intensity){
        return (((220-age)-restingPulse)*intensity)+restingPulse;
    }
}
