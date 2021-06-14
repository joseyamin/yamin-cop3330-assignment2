package ex35;
/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */

/*
Create a program that picks a winner for a contest or prize drawing.
Prompt for names of contestants until the user leaves the entry blank. Then randomly select a winner.
 */
import java.util.Scanner;

public class Sol35 {
    public static void main(String[] args){
        Contest contest=new Contest();

        contest.addInputNames();

        System.out.print("And the winner is... "+ contest.generateWinner());
    }
}

