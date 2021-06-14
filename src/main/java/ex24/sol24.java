package ex24;

/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*Create a program that compares two strings and determines if the two strings are anagrams.
The program should prompt for both input strings and display the output as shown in the example that follows.
 */

import java.util.Scanner;

public class sol24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        String str1 = in.next();
        System.out.print("Enter the second string: ");
        String str2 = in.next();
        Anagram anagram=new Anagram();
        boolean b=anagram.isAnagram(str1,str2);

        if(b){
            System.out.println("\""+str1+"\" and \""+str2+"\" are anagrams.");
        }else{
            System.out.println("\""+str1+"\" and \""+str2+"\" are not anagrams.");
        }
    }
}
