package ex31;

/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself.
The Karvonen heart rate formula is one method you can use to determine your rate. Create a program that prompts for your age and your resting heart rate.
Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%. Generate a table with the results as shown in the example output. The formula is
TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
 */

import java.util.Scanner;

public class Sol31 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Resting Pulse: ");
        double restingPulse=in.nextDouble();
        System.out.print("Age: ");
        double age=in.nextDouble();

        printTable(age,restingPulse);
    }

    private static void printTable(double age,double restingPulse){
        TargetHeartRate targetHeartRateCalculator=new TargetHeartRate();
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|----------");
        for(int i=55;i<=95;i+=5){
            System.out.println(i+"%          | "+Math.round(targetHeartRateCalculator.calculateBPM(age,restingPulse,i/100f))+" bpm");
        }
    }
}
