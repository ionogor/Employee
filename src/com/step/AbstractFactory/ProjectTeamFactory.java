package com.step.AbstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    ProjectManager getManageProject();
    Tester getTester();

}
