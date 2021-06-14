package ex26;

public class CalculatePayOffMonths {
    public double calculateMonthsUntilPaidOff(double i,double b,double p){
        return Math.ceil((-1/30f)*Math.log(1+b/p*(1-Math.pow((1+i),30)))/Math.log(1+i));
    }
}
