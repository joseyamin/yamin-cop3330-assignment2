package ex29;
/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it will take to double your investment.

The formula is

years = 72 / r
where r is the stated rate of return.
 */

import java.util.Scanner;

public class Sol29 {
    public static void main(String[] args){
        double rate=inputRate();
        double years=yearsToDoubleInvestment(rate);
        System.out.println("It will take "+years+" years to double your initial investment.");
    }

    private static double inputRate(){
        Scanner in=new Scanner(System.in);
        boolean numberInput=false;
        double number=0;

        while(!numberInput) {
            try {
                System.out.print("What is the rate of return? ");
                number = Double.parseDouble(in.next());
                if (number != 0) {
                    numberInput = true;
                }else{
                    System.out.println("Sorry. That's not a valid input.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Sorry. That's not a valid input.");
            }

        }
        return number;
    }

    public static double yearsToDoubleInvestment(double rate){
        return 72/rate;
    }

}

