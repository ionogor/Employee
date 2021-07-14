package com.step.AbstractFactory.baking;

import com.step.AbstractFactory.Developer;
import com.step.AbstractFactory.ProjectManager;
import com.step.AbstractFactory.ProjectTeamFactory;
import com.step.AbstractFactory.Tester;

public class JavaDeveloper implements Developer {

    @Override
    public void writecode() {
        System.out.println("Java programming code...");
    }
}
