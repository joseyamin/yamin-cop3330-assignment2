package ex39;

import java.util.Comparator;

public class Employee {
    public String firstName;
    public String lastName;
    public String position;
    public String date;

    public Employee createEmployee(String firstName,String lastName,String position,String date){
        Employee newEmployee=new Employee();
        newEmployee.firstName=firstName;
        newEmployee.lastName=lastName;
        newEmployee.position=position;
        newEmployee.date=date;
        return newEmployee;
    }

    public String getLastName(){
        return lastName;
    }



    public static Comparator<Employee> COMPARE_BY_NAME = new Comparator<Employee>() {
        public int compare(Employee one, Employee other) {
            return one.lastName.compareTo(other.lastName);
        }
    };

    public String toString(){
        return (firstName+" "+lastName+"\t|"+position+"\t|"+date+"\n");

    }
}
