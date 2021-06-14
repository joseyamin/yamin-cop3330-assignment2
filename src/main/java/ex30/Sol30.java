package ex30;
/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */

import java.util.Scanner;

public class Sol30 {
    public static void main(String[] args){
        printTable();
    }

    private static void printTable(){
        for(int i=1;i<=12;i++){
            for(int j=1;j<=12;j++){
                System.out.printf("%6d", i * j);
            }
            System.out.println();
        }
    }
}

