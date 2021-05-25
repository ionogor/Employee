package com.step;

import com.step.employee.Employee;
import com.step.service.EmployeeService;
import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeService employeeService=new EmployeeService();

       employeeService.showMenu();


    }
}
