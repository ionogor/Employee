package com.step.AbstractFactory;

import com.step.AbstractFactory.baking.BankingFactoryTeam;
import com.step.AbstractFactory.baking.JavaDeveloper;

public class Main {
    public static void main(String[] args) {

        ProjectTeamFactory projectTeamFactory=new BankingFactoryTeam();

       ProjectManager projectManager= projectTeamFactory.getManageProject();
        Developer javaDeveloper= projectTeamFactory.getDeveloper();
        Tester tester=projectTeamFactory.getTester();

        System.out.println("Main");

        projectManager.ManageProject();
        javaDeveloper.writecode();
        tester.testcode();


    }
}
