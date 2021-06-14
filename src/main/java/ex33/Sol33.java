package ex33;

/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
    Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again later."
 */

import java.util.Scanner;

public class Sol33 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Magic8Ball phraseGenerator=new Magic8Ball();
        System.out.print("What's your question? ");
        in.next();


        System.out.println(phraseGenerator.generateAnswer());
    }
}
