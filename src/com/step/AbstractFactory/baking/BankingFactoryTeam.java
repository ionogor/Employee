package com.step.AbstractFactory.baking;

import com.step.AbstractFactory.Developer;
import com.step.AbstractFactory.ProjectManager;
import com.step.AbstractFactory.ProjectTeamFactory;
import com.step.AbstractFactory.Tester;

public class BankingFactoryTeam implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProjectManager getManageProject() {
        return new QAManager();
    }

    @Override
    public Tester getTester() {
        return new TesterQA();
    }
}
