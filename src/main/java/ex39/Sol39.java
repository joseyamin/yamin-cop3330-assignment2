package ex39;

/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Given the following data set, create a program that sorts all employees by last name and prints them to the screen in a tabular format.
 */


import java.util.*;

public class Sol39 {
    public static void main(String[] args){
        Employee employee=new Employee();
        ArrayList employeeArrayList=new ArrayList<Employee>();
        employeeArrayList.add(employee.createEmployee("John","Johnson","Manager","2016-12-31"));
        employeeArrayList.add(employee.createEmployee("Tou","Xiong","Software Engineer","2016-10-05"));
        employeeArrayList.add(employee.createEmployee("Michaela","Michaelson","District Manager","2015-12-19"));
        employeeArrayList.add(employee.createEmployee("Jake","Jacobson","Programmer",""));
        employeeArrayList.add(employee.createEmployee("Jacquelyn","Jackson","DBA",""));
        employeeArrayList.add(employee.createEmployee("Sally","Webber","Web Developer","2015-12-18"));


        Collections.sort(employeeArrayList,Employee.COMPARE_BY_NAME);

        Map<Integer,Employee> employeeMap=new  HashMap<Integer,Employee>();

        for(int i=0;i<employeeArrayList.size();i++){
            Employee temp =(Employee) employeeArrayList.get(i);
            employeeMap.put(i,temp);
        }

        System.out.println("Name                | Position          | Separation Date");
        System.out.println("---------------------------------------------------------");
        Set<Integer> setKeys = employeeMap.keySet();
        for(Integer key : setKeys){
            System.out.print( employeeMap.get(key) );
        }

    }
}
