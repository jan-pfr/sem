package com.napier.sem;
import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        ConnectionLayer connectionLayer = new ConnectionLayer();
        connectionLayer.connect();
        BusinessLayer businessLayer = new BusinessLayer();

        // Extract employee salary information
        ArrayList<Employee> employees = businessLayer.getAllSalaries(connectionLayer.con);

        // Test the size of the returned data - should be 240124
        System.out.println(employees.size());
        ArrayList<Employee> employees1 = businessLayer.getAllSalariesbyRole("Engineer", connectionLayer.con);
        ArrayList<Employee> employees2 = businessLayer.getSalariesbyDepartment("d002", connectionLayer.con);
        a.printSalaries(employees2);
        //a.printSalaries(employees1);
        //a.printSalaries(employees);

        // Disconnect from database
        connectionLayer.disconnect();
    }

    /**
     * Gets all the current employees and salaries.
     * @return A list of all employees and salaries, or null if there is an error.
     */
    public void displayEmployee(Employee emp)
    {
        if (emp != null)
        {
            System.out.println(
                    emp.emp_no + " "
                            + emp.first_name + " "
                            + emp.last_name + "\n"
                            + emp.title + "\n"
                            + "Salary:" + emp.salary + "\n"
                            + emp.dept + "\n"
                            + "Manager: " + emp.manager + "\n");
        }
    }
    /**
     * Prints a list of employees.
     * @param employees The list of employees to print.
     */
    public void printSalaries(ArrayList<Employee> employees)
    {
        // Print header
        System.out.println(String.format("%-10s %-15s %-20s %-8s %-20s", "Emp No", "First Name", "Last Name", "Salary", "Department"));
        // Loop over all employees in the list
        for (Employee emp : employees)
        {
            String emp_string =
                    String.format("%-10s %-15s %-20s %-8s %20s",
                            emp.emp_no, emp.first_name, emp.last_name, emp.salary, emp.dept.dept_name);
            System.out.println(emp_string);
        }
    }
}