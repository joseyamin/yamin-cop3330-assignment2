package ex27;

/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
 */

import java.util.Scanner;

public class sol27 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //get info
        System.out.print("Enter the first name: ");
        String firstName=in.next();
        System.out.print("Enter the last name: ");
        String lastName=in.next();
        System.out.print("Enter the ZIP code: ");
        String zipCode=in.next();
        System.out.print("Enter the employee ID: ");
        String employeeID=in.next();
        validateInputs(firstName,lastName,zipCode,employeeID);
    }

    private static void validateInputs(String firstName,String lastName,String zipCode,String employeeID){
        ValidChecker checker=new ValidChecker();
        int errors=0;
        if(!checker.firstNameValid(firstName)){
            errors++;
            System.out.println("The first name must be at least 2 characters long.");
        }
        if(!checker.lastNameValid(firstName)){
            errors++;
            System.out.println("The last name must be at least 2 characters long.");
        }
        if(!checker.employeeIDValid(employeeID)){
            errors++;
            System.out.println("The employee ID must be in the format of AA-1234.");
        }
        if(!checker.zipCodeValid(zipCode)){
            errors++;
            System.out.println("The zipcode must be a 5 digit number.");
        }
        System.out.println("Errors found: "+ errors);
    }
}
