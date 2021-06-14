package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {

    @Test
    void removeEmployeeOne() {
        EmployeeManager employeeManager=new EmployeeManager();
        int expected=4;
        employeeManager.removeEmployee("John Smith");
        int actual=employeeManager.employeesSize;
        assertEquals(expected,actual);
    }

    @Test
    void removeEmployeeWrongName() {
        EmployeeManager employeeManager=new EmployeeManager();
        int expected=5;
        employeeManager.removeEmployee("Jose");
        int actual=employeeManager.employeesSize;
        assertEquals(expected,actual);
    }
}