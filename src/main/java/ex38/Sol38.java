package ex38;
/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Create a program that prompts for a list of numbers, separated by spaces.
Have the program print out a new list containing only the even numbers.
 */

import java.util.Scanner;

public class Sol38 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();

        int numsArray[]=createArray(input);

        FilterEvens filterEvens=new FilterEvens();
        numsArray=filterEvens.filterEvenNumber(numsArray);

        System.out.print("The even numbers are:");
        printArr(numsArray);
        System.out.print(".");

    }

    private static void printArr(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
    }

    public static int[] createArray(String input){
        int[] intArray=new int[(input.length()/2+1)];
        int p=0;
        for(int i=0;i<input.length();i++){
            if(i%2==0){
                intArray[p]=input.charAt(i)-'0';
                p++;
            }
        }
        return intArray;
    }

}
