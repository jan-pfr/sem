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
        // Connect to database
        if (args.length < 1)
        {
            connectionLayer.connect("localhost:33070");
        }
        else
        {
            connectionLayer.connect(args[0]);
        }
        //connectionLayer.connect("localhost:33070");
        BusinessLayer businessLayer = new BusinessLayer();

        // Extract employee salary information
        ArrayList<Employee> employees = businessLayer.getAllSalaries(connectionLayer.con);

        // Test the size of the returned data - should be 240124
        System.out.println(employees.size());
        ArrayList<Employee> employees1 = businessLayer.getAllSalariesbyRole("Engineer", connectionLayer.con);
        ArrayList<Employee> employees2 = businessLayer.getDepartment("Sales", connectionLayer.con);
        ArrayList<Employee> employees3 = businessLayer.getSalariesbyDepartment("d007", connectionLayer.con);
        //a.printSalaries(employees2);
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
                    "Employee No.: "+emp.emp_no + "\n"
                            + "First Name: "+emp.first_name + "\n"
                            + "Second Name: "+emp.last_name + "\n"
                            + "Title: "+emp.title + "\n"
                            + "Salary: " + emp.salary + "\n"
                            + "Department: "+ emp.dept.dept_name + "\n"
                            + "Manager: " + emp.manager.first_name + " " +emp.manager.last_name+ "\n");
        } else{System.out.println("No employees");}
    }
    /**
     * Prints a list of employees.
     * @param employees The list of employees to print.
     */
    public void printSalaries(ArrayList<Employee> employees)
    {
        // Check employees is not null
        if (employees == null)
        {
            System.out.println("No employees");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-15s %-20s %-8s", "Emp No", "First Name", "Last Name", "Salary"));
        // Loop over all employees in the list
        for (Employee emp : employees)
        {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-15s %-20s %-8s",
                            emp.emp_no, emp.first_name, emp.last_name, emp.salary);
            System.out.println(emp_string);
        }
    }
}