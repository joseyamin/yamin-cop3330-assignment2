package ex26;

/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Write a program that will help you determine how many months it will take to pay off a credit card balance. The program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment.
The program should then return the number of months needed (rounded up to the next integer value).
 */
import java.util.Scanner;

public class sol26 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("What is your balance? ");
        double balance=in.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double aprPercent=in.nextDouble();
        double dailyRate=(aprPercent/100f)/365f;
        System.out.print("What is the monthly payment you can make? ");
        double monthlyPay=in.nextDouble();

        CalculatePayOffMonths monthCalculator=new CalculatePayOffMonths();
        double numberOfMonths=monthCalculator.calculateMonthsUntilPaidOff(dailyRate,balance,monthlyPay);
        System.out.println("It will take you "+ numberOfMonths+ " months to pay off this card.");
    }
}

