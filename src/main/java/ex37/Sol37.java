package ex37;

/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Create a program that generates a secure password.
Prompt the user for the minimum length, the number of special characters, and the number of numbers.
Then generate a password for the user using those inputs
 */

import java.util.Scanner;

public class Sol37 {

    public static void main(String[] args){
        int minLength=getValidInputNumber("What's the minimum length? ");
        int amtSpecialChars=getValidInputNumber("How many special characters? ");
        int amtNums=getValidInputNumber("How many numbers? ");

        int amtOfLetters=calculateAmtOfLetters(minLength,amtSpecialChars,amtNums);

        PasswordGenerator passwordGenerator=new PasswordGenerator();
        String password=passwordGenerator.generatePassword(amtSpecialChars,amtNums,amtOfLetters);
        System.out.println("Your Password is "+ password);
    }
    private static int calculateAmtOfLetters(int minLength,int amtSpecial,int amtNums){
        int totalAdded=amtNums+amtSpecial;
        if(minLength<=2*totalAdded){
            return totalAdded;
        }else{
            return (totalAdded)+(minLength-totalAdded);
        }
    }

    private static int getValidInputNumber(String question){
        Scanner in=new Scanner(System.in);
        String strNum="";
        int num=-1;
        while(num<0) {
            try {
                System.out.print(question);
                num = Integer.parseInt(in.next());
            } catch (NumberFormatException ex) {
                System.out.println("Input number please.");
            }
        }
        return num;
    }
}
