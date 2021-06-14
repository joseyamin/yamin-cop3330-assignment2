package ex40;
/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Sorting records is helpful, but sometimes you need to filter down the results to find or display only what you’re looking for.

Given the following data set create a program that lets a user locate all records that match the search string by comparing the search string to the first or last name field.
 */
import ex39.Employee;

import java.util.*;

public class Sol40 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ex39.Employee employee=new ex39.Employee();
        ArrayList employeeArrayList=new ArrayList<Employee>();
        employeeArrayList.add(employee.createEmployee("John","Johnson","Manager","2016-12-31"));
        employeeArrayList.add(employee.createEmployee("Tou","Xiong","Software Engineer","2016-10-05"));
        employeeArrayList.add(employee.createEmployee("Michaela","Michaelson","District Manager","2015-12-19"));
        employeeArrayList.add(employee.createEmployee("Jake","Jacobson","Programmer",""));
        employeeArrayList.add(employee.createEmployee("Jacquelyn","Jackson","DBA",""));
        employeeArrayList.add(employee.createEmployee("Sally","Webber","Web Developer","2015-12-18"));

        Map<Integer,Employee> employeeMap=new HashMap<Integer,Employee>();

        for(int i=0;i<employeeArrayList.size();i++){
            Employee temp =(Employee) employeeArrayList.get(i);
            employeeMap.put(i,temp);
        }
        System.out.println("Enter a search string: ");
        String str=in.next();


        System.out.println("Name                | Position          | Separation Date");
        System.out.println("---------------------------------------------------------");
        Set<Integer> setKeys = employeeMap.keySet();
        for(Integer key : setKeys){
            if(employeeMap.get(key).lastName.substring(0,str.length()).equals(str) || employeeMap.get(key).firstName.substring(0,str.length()).equals(str)) {
                System.out.print(employeeMap.get(key));
            }
        }
    }
}

