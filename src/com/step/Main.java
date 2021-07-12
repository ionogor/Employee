package com.step;

import com.step.employee.Employee;
import com.step.service.EmployeeDB;
import com.step.service.EmployeeService;
import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      //  EmployeeService employeeService=new EmployeeService();

       //employeeService.showMenu();

        EmployeeDB employeeDB=new EmployeeDB();

        //List<Employee> employeeList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter name:");
        String name=scanner.nextLine();
        System.out.println("Enter surname:");
        String surname=scanner.nextLine();
        System.out.println("Enter idnp");
        String idnp=scanner.nextLine();
        employeeDB.create(new Employee(name,surname,idnp));

        List<Employee> listRead = employeeDB.read();
        for (Employee employee: listRead)
        {
            System.out.println(employee);
        }

        Employee employee=listRead.get(7);

       employeeDB.update(employee);


    }


}
