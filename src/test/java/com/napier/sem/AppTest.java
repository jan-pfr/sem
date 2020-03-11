package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    @Test
    void printSalariesTestNull()
    {
        app.printSalaries(null);
    }

    @Test
    void printSalariesTestEmpty()
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        app.printSalaries(employees);
    }

    @Test
    void printSalaries()
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees.add(emp);
        app.printSalaries(employees);
    }
    @Test
    void displayEmployees(){
        app.displayEmployee(null);

        Employee emp = new Employee();
        Employee manager = new Employee();
        manager.first_name = "Jan";
        manager.last_name = "Cassisi";
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.dept.dept_name = " Finance";
        emp.manager = manager;
        emp.salary = 55000;
         app.displayEmployee(emp);

    }
}