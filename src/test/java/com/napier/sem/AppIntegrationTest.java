package com.napier.sem;

import com.mysql.cj.jdbc.exceptions.ConnectionFeatureNotAvailableException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;
    static ConnectionLayer connection;
    static BusinessLayer businessLayer;

    @BeforeAll
    static void init()
    {
        app = new App();
        connection = new ConnectionLayer();
        businessLayer = new BusinessLayer();
        connection.connect("localhost:33070");

    }

    @Test
    void testGetEmployee()
    {
        Employee emp = businessLayer.getEmployee(255530, connection.con);
        assertEquals(emp.emp_no, 255530);
        assertEquals(emp.first_name, "Ronghao");
        assertEquals(emp.last_name, "Garigliano");
    }
}