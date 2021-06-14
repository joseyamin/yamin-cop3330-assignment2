package ex34;

/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Create a small program that contains a list of employee names.
Print out the list of names when the program runs the first time. Prompt for an employee name and remove that specific name from the list of names.
Display the remaining employees, each on its own line.
 */
import java.util.Scanner;

public class Sol34 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        EmployeeManager employeeManager=new EmployeeManager();

        System.out.println(employeeManager.toString());

        System.out.print("Enter an employee name to remove: ");
        employeeManager.removeEmployee(in.nextLine());

        System.out.println(employeeManager.toString());
    }
}

