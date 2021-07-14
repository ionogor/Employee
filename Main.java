package com.step;

import com.step.Tests.Singelton;
import com.step.employee.Employee;
import com.step.service.EmployeeDB;
import com.step.service.EmployeeService;
import com.sun.deploy.util.ArrayUtil;

import javax.swing.plaf.ScrollBarUI;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            Singelton singelton=Singelton.getINSTANCE();



       // singelton.showMessage();

        //Singelton singelton1=Singelton.getINSTANCE();

        //singelton1.showMessage();

    }


}
