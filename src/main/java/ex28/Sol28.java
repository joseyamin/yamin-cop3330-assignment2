package ex28;


/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Write a program that prompts the user for five numbers and computes the total of the numbers.
Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.
 */

import java.util.Scanner;

public class Sol28 {
    public static void main(String[] args){

    }
    public static double inputAndComputeTotal(){
        double total=0;
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter a number: ");
            total+=in.nextDouble();
        }
        return total;
    }
}

