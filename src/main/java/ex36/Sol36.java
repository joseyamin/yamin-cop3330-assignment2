package ex36;
/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Write a program that prompts for response times from a website in milliseconds. It should keep asking for values until the user enters “done.”
The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Sol36 {
    private static ArrayList numsList=new ArrayList<Double>();

    public static void main(String[] args){
        ComputingStatistics statisticsComputer=new ComputingStatistics();
        fillList();
        System.out.println("Numbers: "+numsList.toString());
        System.out.println("The average is "+statisticsComputer.average(numsList) );
        System.out.println("The minimum is "+statisticsComputer.minimum(numsList));
        System.out.println("The maximum is "+statisticsComputer.maximum(numsList));
        System.out.println("The standard deviation is "+statisticsComputer.std(numsList));
    }

    private static void fillList(){
        Scanner in=new Scanner(System.in);
        String input="";
        while(!input.equalsIgnoreCase("done")){
            System.out.print("Enter a number: ");
            input=in.nextLine();

            if(input.equalsIgnoreCase("done")){
                break;
            }

            try{
                numsList.add(Double.parseDouble(input));
            }catch (NumberFormatException ex) {
                System.out.println("Please enter a number or 'done'");
            }

        }
    }
}

