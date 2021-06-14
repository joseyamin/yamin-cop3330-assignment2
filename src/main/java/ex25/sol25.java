package ex25;
/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
 */

import java.util.Scanner;

public class sol25 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter password: ");
        String password=in.next();

        PasswordStrength passwordStrength=new PasswordStrength();
        int passStrength=passwordStrength.passwordValidator(password);

        printStrength(passStrength,password);
    }


    private static void printStrength(int strength,String password){
        if(strength==0){
            System.out.println(" The password \""+password+"\" is a very weak password");
        }else if(strength==1){
            System.out.println(" The password \""+password+"\" is a weak password");
        }else if(strength==2){
            System.out.println(" The password \""+password+"\" is a strong password");
        }else{
            System.out.println(" The password \""+password+"\" is a very strong password");
        }
    }
}