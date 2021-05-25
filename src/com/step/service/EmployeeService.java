package com.step.service;

import com.step.employee.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeService {

   Employee[] em;
   public void showMenu()
   {
       Scanner scanner=new Scanner(System.in);
       MeniuOptions meniuOptions;
        boolean verifInput=false;
        while(!verifInput)
        {
           System.out.println("\t\t\t Hello user");
           System.out.println("\t\t===========================");
           System.out.println("\t\t\t Please type options");
           System.out.println("CREATE =  Create employee");
           System.out.println("READ   =  Read employee");
           System.out.println("UPDATE =  Update employee");
           System.out.println("DELETE =  Delete employee");

           String selectOption=scanner.nextLine().toUpperCase(Locale.ROOT);

           try{
               meniuOptions=MeniuOptions.valueOf(selectOption);

               switch (meniuOptions)
               {
                   case CREATE: this.createEmployee();break;
                   case READ:this.readEmployee();break;
                   case UPDATE:this.udateEmployee();break;
                   // case DELETE:this;
               }

           }
           catch (Exception ex)
           {

           }



        }

   }

    public  void createEmployee(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("How many employee you want create ? ");
        int numEmployee=scanner.nextInt();
         em=new Employee[numEmployee];
        for (int i=0;i<numEmployee;i++)
        {
            System.out.println("Enter name of "+(i+1) +" employee");
            String nameEmployee=scanner.next();

            System.out.println("Enter LASTNAME of "+(i+1)+ " employee");
            String lastNameEmployee=scanner.next();

            System.out.println("Enter SEX of "+(i+1)+" employee");
            String sexEmployee=scanner.next();

            System.out.println("Enter IDNP of "+(i+1)+" employee");
            String idnpEmployee=scanner.next();

            System.out.println("Enter STAGE of "+(i+1)+"employee");
            int stage=scanner.nextInt();
            em[i]=new Employee(nameEmployee,lastNameEmployee,idnpEmployee,sexEmployee,stage);

        }
        this.showMenu();

    }
    public void readEmployee() {
        try {
            if (em.equals(null)) {
                System.out.println("Employee does not exit");
            } else {
                for (int i = 0; i < em.length; i++) {
                    System.out.println("Employee [ " + i +1+ " ]" + em[i].getName() + " " + em[i].getLastname() + " " + em[i].getSex());
                this.showMenu();

                }
            }
        }catch (Exception ex)
        {
            System.out.printf(ex.getMessage());
        }
    }
    public void udateEmployee()
    {
        while(true) {
            System.out.println("Enter id employee to update");
            Scanner sc = new Scanner(System.in);
            int idd = sc.nextInt();
        if(em.equals(null))
        {
            System.out.println("ERROR NO OBJECT FOUND!!!");
        }else {
            for (int i = 0; i < em.length; i++) {
                if (em[i].getId() == idd) {
                    System.out.println(em[i]);

                }
                else
                    return;

            }
        }
            System.out.println("What you want to update ?");
            System.out.println("---------Select Option----------");
            System.out.println("ENTER 1. Name employee");
            System.out.println("ENTER 2. LasName employee");
            System.out.println("ENTER 4. Sex employee");
            System.out.println("ENTER 5. Stage employee");
            System.out.println("ENTER 6. EXIT");
            System.out.println("--------------------------------");

            int selectOption = sc.nextInt();
            switch (selectOption) {
                case 1: {
                    System.out.println("Enter new name employee:");
                    em[--idd].setName(sc.nextLine());break;
                }
                case 6:{
                    break;
                }

            }

        }

    }
        public  void deleteEmployee()
        {
            Employee[] emNew=new Employee[em.length-1];
            System.out.println("Enter id employee from delete");
            int idd=(new Scanner(System.in).nextInt());
            try {
                for (int i=0,k=0;i<em.length;i++)
                {
                    if(em[i].getId()==idd)
                    {
                        continue;
                    }
                    emNew[k++]=em[i];
                }
            }
            catch (NullPointerException ex)
            {
                System.out.printf("Element not exit, please try again");

            }




        }



}
