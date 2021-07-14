package com.step.service;

import com.step.employee.Employee;
import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.scene.control.TableView;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDB {

    /**
     * Facem conectare la BD
     */
    public Connection ConnectDB() throws SQLException {
        String db="jdbc:postgresql://localhost:5432/Employee";
        String user="postgres";
        String pass="admin";

        return DriverManager.getConnection(db,user,pass);

    }

    /**
     * crearea Employee
     */

    public void create(Employee employee)
    {
        try {

            // facem insert in DB
            String sql="insert into db.emp (name,surname,idnp) values (?,?,?) ";
            Connection connection = ConnectDB();

            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1,employee.getName());
            prepareStatement.setString(2,employee.getLastname());
            prepareStatement.setString(3,employee.getIdnp());

            //execute prepare statment SQL

            int count=prepareStatement.executeUpdate();

            String message=count!=0 ? "A fost introdus cu succes" : "Eroare de inserare";
            System.out.println(message);
            connection.close(); // inchidem conectarea

        }catch (SQLException ex)
        {
            System.out.println("Eroare de citire " + ex.getMessage());
        }
    }

    public static Employee createEmployeeKeyboard()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=scanner.nextLine();
        System.out.println("Enter surname:");
        String surname=scanner.nextLine();
        System.out.println("Enter idnp");
        String idnp=scanner.nextLine();

        Employee employee=new Employee(name,surname,idnp);
        return  employee;
    }

    /**
     * citirea employee

     */

    public List<Employee> read()
    {
        try {

            List<Employee> listEmployee=new ArrayList<>();

            String sql=" select id,name,surname,idnp from db.emp ";
            Connection connection=ConnectDB();
            PreparedStatement preparedStatement=connection.prepareStatement(sql);

            ResultSet resultSet=preparedStatement.executeQuery(); // obtinem rindurile din select
            while (resultSet.next())
            {
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String lastname=resultSet.getString("surname");
                String idnp=resultSet.getString("idnp");

                listEmployee.add(new Employee(id,name,lastname,idnp));

            }

            connection.close();
            return listEmployee;

        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
            return new ArrayList<>();
        }
    }

    /**
     *
     * stergem  employee dupa id
     */
    public void delete(Employee employee) {

        String sql = "delete from db.emp where id= ?";
        try {
            Connection connection = ConnectDB();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,employee.getId());

            int rows=preparedStatement.executeUpdate();
            String message=rows==1 ? "A fost sters cu succes": "Nu este nimic de sters";

            System.out.println(message);

        } catch (SQLException Ex) {
            System.out.println(Ex.getMessage());
            System.out.println("Eroare la stergere"+ Ex.getMessage());

            }
        }

    /**
     *
     * update employee
     */

    public void update(Employee employee)
        {
            try{
                String sql="update db.emp set name=?,surname=?,idnp=? where id=?";
                Connection connection=ConnectDB();
                PreparedStatement preparedStatement=connection.prepareStatement(sql);
                preparedStatement.setString(1,employee.getName());
                preparedStatement.setString(2,employee.getLastname());
                preparedStatement.setString(3,employee.getIdnp());

                int count=preparedStatement.executeUpdate();
                String message=count==1 ? "A fost inoit cu succes": "Nu a fost nimic inoit";

                System.out.println(message);

            }
            catch (SQLException ex)
            {
                System.out.println(ex.getMessage());
            }

        }
    public  void truncateTable(Employee employee)

    {
        try{
            String sql="TRUNCATE table db.emp ";
            Connection connection =ConnectDB();
            PreparedStatement preparedStatement=connection.prepareStatement(sql);

            Boolean rows=preparedStatement.execute();

            String rez=rows == true ? "Nu sunt date" : "Stergere cu succes!";

            System.out.println(rez);

        }catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }


    }



    }

